package Kodlamaio.HrmsProject.bussines.concretes;

import java.util.List;

import Kodlamaio.HrmsProject.bussines.abstracts.JobPositionService;
import Kodlamaio.HrmsProject.dataAcces.abstrcats.JobPositionDao;
import Kodlamaio.HrmsProject.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public JobPosition findByJobName(String jobName) {
		
		return this.jobPositionDao.findByJobName(jobName);
		
		
	}

	@Override
	public List<JobPosition> getAll() {
		
       return this.jobPositionDao.findAll();
	}

}
