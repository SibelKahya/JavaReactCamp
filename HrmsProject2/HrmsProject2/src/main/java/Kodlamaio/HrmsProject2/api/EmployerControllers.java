package Kodlamaio.HrmsProject2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HrmsProject2.bussines.abstracts.EmployerService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.Employer;

@RestController
@RequestMapping("/api/EmployerControllers")
public class EmployerControllers {
	
	private EmployerService employerService;

	@Autowired
	public EmployerControllers(EmployerService employerService) {
	
		this.employerService = employerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
		
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getall(){
		return this.employerService.getall();
		
	}
	

}
