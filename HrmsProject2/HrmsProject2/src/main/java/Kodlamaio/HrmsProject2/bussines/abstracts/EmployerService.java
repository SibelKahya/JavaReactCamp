package Kodlamaio.HrmsProject2.bussines.abstracts;

import java.util.List;

import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.Employer;

public interface EmployerService {
	
	Employer findByEmail(String email);
	Result add(Employer employer);
	DataResult<List<Employer>> getall();

}
