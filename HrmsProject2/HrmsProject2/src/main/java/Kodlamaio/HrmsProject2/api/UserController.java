package Kodlamaio.HrmsProject2.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HrmsProject2.bussines.abstracts.UserService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.User;

@RestController
@RequestMapping("/api/usercontrollers")
public class UserController {
	
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public Result add(User user) {
		return this.userService.add(user);		
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getall(){
		return this.userService.getall();
	}
	//en son bunu mu ekledin
	
	

}
