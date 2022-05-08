package Kodlamaio.HrmsProject2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HrmsProject2.bussines.abstracts.CandidateService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidateControllers")
public class CandidateControllers {
	
	private CandidateService candidateService;
    
	@Autowired
	public CandidateControllers(CandidateService candidateService) {
		
		this.candidateService = candidateService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
		
	}
	@RequestMapping("/getall")
	public DataResult<List<Candidate>> getall(){
		
		return this.candidateService.getall();
		
	}
	@RequestMapping("getByCandidateName")
	public DataResult<List<Candidate>> getByCandidateName(String firstName){
		
		return this.candidateService.getByCandidateName(firstName);
	}
	

}
