package Kodlamaio.HrmsProject2.bussines.abstracts;

import java.util.List;

import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.Candidate;

public interface CandidateService {
	
	Candidate findByEmail(String email);
	
	Candidate finfdByIdentyNumber(String identityNumber);
	Result add(Candidate candidate);
	
	DataResult<List<Candidate>> getall();
	
	DataResult<List<Candidate>> getByCandidateName(String firstName);
	

}
