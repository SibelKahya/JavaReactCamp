package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import business.abstracts.ValidaorService;
import core.abstracts.LoginServices;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidaorService service;
	private LoginServices loginServices;
	
	

	public UserManager(UserDao userDao,ValidaorService service,LoginServices loginServices) {
		super();
		this.userDao = userDao;
		this.service=service;
		this.loginServices=loginServices;
		
	}

	@Override
	public void add(User user) {
		
	if(!service.validateName(user.getName()) && 
		service.validateSurname(user.getLastName())&& 
		service.validateMailAddress(user.getEmail())&& 
		service.validatePssword(user.getPassword())){
		System.out.println("Bilgiler eksik veya hatali Lutfen dogru ve eksiksiz doldurunuz");
		return;
			
		}
	this.userDao.add(user);
		
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}
	

}
