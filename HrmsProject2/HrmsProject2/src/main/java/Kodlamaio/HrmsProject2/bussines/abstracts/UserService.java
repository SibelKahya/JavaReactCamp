package Kodlamaio.HrmsProject2.bussines.abstracts;

import java.util.List;

import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	DataResult<List<User>> getall();
	User findByEmail(String email);

}
