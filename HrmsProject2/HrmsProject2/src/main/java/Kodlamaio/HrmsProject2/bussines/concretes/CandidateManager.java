package Kodlamaio.HrmsProject2.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HrmsProject2.bussines.abstracts.CandidateService;
import Kodlamaio.HrmsProject2.core.utilities.Verification.UserCheckService;
import Kodlamaio.HrmsProject2.core.utilities.mail.EmailService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.ErrorDataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.ErrorResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesDataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesResult;
import Kodlamaio.HrmsProject2.dataAcces.abstracts.CandidateDao;
import Kodlamaio.HrmsProject2.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private UserCheckService userCheckService;
	private EmailService emailService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService, EmailService emailService) {

		this.candidateDao = candidateDao;
		this.userCheckService = userCheckService;
		this.emailService = emailService;
	}

	@Override
	public Candidate findByEmail(String email) {

		return this.candidateDao.findByEmail(email);
	}

	@Override
	public Candidate finfdByIdentyNumber(String identityNumber) {

		return this.candidateDao.findByIdentityNumber(identityNumber);
	}

	@Override
	public Result add(Candidate candidate) {
		if (this.findByEmail(candidate.getEmail()) != null) {
			return new ErrorResult("Daha önce kayıtlı email var");
		}
		if (this.finfdByIdentyNumber(candidate.getIdentityNumber()) != null) {
			return new ErrorResult("Aynı tc kimlik numarası var");
		}
		if (!userCheckService.isVerified(candidate)) {
			return new ErrorResult("Kullanıcı Dğrulanamadı");

		}
		this.emailService.sendMailVerified(candidate.getEmail(), "123456");
		this.candidateDao.save(candidate);
		return new SuccesResult("Eklendi");

	}

	@Override
	public DataResult<List<Candidate>> getall() {

		return new SuccesDataResult<List<Candidate>>(this.candidateDao.findAll(), "Listelendi");
	}

	
	  @Override 
	  public DataResult<List<Candidate>> getByCandidateName(String firstName) {
	  
	  return new SuccesDataResult<>(this.candidateDao.getByCandidateName(firstName));
	  }
	 

}
