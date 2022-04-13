package core.concretes;

import JScannerLogin.JScannerLoginManager;
import core.abstracts.LoginServices;
import entities.concretes.User;

public class LoginManager implements LoginServices{

	@Override
	public void mylogin(User user) {
		
		JScannerLoginManager jScannerLoginManager= new JScannerLoginManager();
		
		jScannerLoginManager.login(user.getEmail());
		
		
		
	}
	

}
