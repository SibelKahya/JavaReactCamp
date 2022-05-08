package Kodlamaio.HrmsProject2.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HrmsProject2.bussines.abstracts.JobPositionService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesDataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesResult;
import Kodlamaio.HrmsProject2.dataAcces.abstracts.JobPositionDao;
import Kodlamaio.HrmsProject2.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	
    @Autowired
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

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
	return new SuccesResult("Eklendi");
	}

	@Override
	public DataResult<List<JobPosition>> getall() {
		
		return new SuccesDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Listelendi");
	}

}
