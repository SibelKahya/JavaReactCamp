package Kodlamaio.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HrmsProject.bussines.abstracts.JobPositionService;
import Kodlamaio.HrmsProject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositionControllers")
public class JobPositionControllers {
	
	private JobPositionService jobPositionService;
	
	
    @Autowired
	public JobPositionControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	
	@RequestMapping("/getAll")
	public List<JobPosition> getAll(){
		
		return this.jobPositionService.getAll();
	}
	
	

}
