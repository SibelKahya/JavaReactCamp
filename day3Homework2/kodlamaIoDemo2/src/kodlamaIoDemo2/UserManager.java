package kodlamaIoDemo2;

public class UserManager {
	
	
	public void add(User user) {           
		System.out.println("Kullanıcı eklendi  :"+user.getFirstName()+user.getLastName());
		
	}
	public void remove(User user) {  
		System.out.println("Kullanıcı silindi");
		
	}
	public void update(User user) { 
		System.out.println("Kullanıcı güncellendi");
		
	}


}
