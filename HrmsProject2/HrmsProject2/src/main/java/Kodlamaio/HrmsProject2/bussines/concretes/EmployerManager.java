package Kodlamaio.HrmsProject2.bussines.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HrmsProject2.bussines.abstracts.EmployerService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.ErrorResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesDataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesResult;
import Kodlamaio.HrmsProject2.dataAcces.abstracts.EmployerDao;
import Kodlamaio.HrmsProject2.entities.concretes.Employer;

@Service
public class EmployerManager  implements EmployerService {
	
	private EmployerDao employerDao;
    
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		
		this.employerDao = employerDao;
	}

	@Override
	public Employer findByEmail(String email) {
	
		return this.employerDao.findByEmail(email);
	}

	@Override
	public Result add(Employer employer) {
		
		if(this.findByEmail(employer.getEmail())!=null) {
			return new ErrorResult("Daha once kayitli email var");
		}
		this.employerDao.save(employer);
		return new SuccesResult("Eklendi");
	}

	@Override
	public DataResult<List<Employer>> getall() {
	
		return new SuccesDataResult<List<Employer>>(this.employerDao.findAll(), "Listelendi");
	}

}
