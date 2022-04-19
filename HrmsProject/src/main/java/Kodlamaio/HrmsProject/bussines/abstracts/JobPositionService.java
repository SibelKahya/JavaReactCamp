package Kodlamaio.HrmsProject.bussines.abstracts;

import java.util.List;

import Kodlamaio.HrmsProject.entities.concretes.JobPosition;


public interface JobPositionService {
	
	JobPosition findByJobName(String jobName);
	
	List<JobPosition> getAll();

}
