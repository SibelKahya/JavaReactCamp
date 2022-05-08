package Kodlamaio.HrmsProject2.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HrmsProject2.bussines.abstracts.UserService;
import Kodlamaio.HrmsProject2.core.utilities.result.DataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.ErrorResult;
import Kodlamaio.HrmsProject2.core.utilities.result.Result;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesDataResult;
import Kodlamaio.HrmsProject2.core.utilities.result.SuccesResult;
import Kodlamaio.HrmsProject2.dataAcces.abstracts.UserDao;
import Kodlamaio.HrmsProject2.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
     @Autowired
	public UserManager(UserDao userDao) {
	
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		
		if(this.findByEmail(user.getEmail())!=null) {
			return new ErrorResult("Aynı email var");
		}
		 this.userDao.save(user);
		 return new SuccesResult("Kullanici eklendi");	
	}

	@Override
	public DataResult<List<User>> getall() {
		return  new SuccesDataResult<List<User>>(this.userDao.findAll(),"Listelendi");
	}

	@Override
	public User findByEmail(String email) {
		
		
		return this.userDao.findByEmail(email);
	}

}
