package Kodlamaio.HrmsProject2.bussines.abstracts;

import java.util.List;

import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.JobPosition;


public interface JobPositionService {
	
	JobPosition findByJobName(String jobName);
	
	List<JobPosition> getAll();
	Result add(JobPosition jobPosition);
	DataResult<List<JobPosition>> getall();

}
