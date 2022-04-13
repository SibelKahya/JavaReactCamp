package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUser implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("hibernate ile "+ user.getName() +" kullan�c�s� eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("hibernate ile "+ user.getName() +" kullan�c�s� silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile "+ user.getName() +" kullan�c�s� guncellendi");
		
	}

}
