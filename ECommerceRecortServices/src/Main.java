import business.concretes.UserManager;
import business.concretes.ValidatorManager;
import core.concretes.MyLoginManager;
import dataAccess.concretes.HibernateUser;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User sibel =new User(1,"Sibel","Kahya","gonulacarsibel@gmail.com","Abc321");
		
		UserManager userManager= new UserManager(new HibernateUser(),new ValidatorManager(),new MyLoginManager());
	     userManager.add(sibel);
	     userManager.login(sibel);
	     
	     MyLoginManager myLoginManager=new MyLoginManager();
	     
	     myLoginManager.mylogin(sibel);

	}

}
