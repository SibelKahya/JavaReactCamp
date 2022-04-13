package core.concretes;

import core.abstracts.LoginServices;
import entities.concretes.User;

public class MyLoginManager implements LoginServices {

	@Override
	public void mylogin(User user) {
		
		System.out.println("Servise basarili bir sekilde entegre edildi hosgeldin "+ user.getName()+" "+user.getLastName()+ "!");
		
	}

}
