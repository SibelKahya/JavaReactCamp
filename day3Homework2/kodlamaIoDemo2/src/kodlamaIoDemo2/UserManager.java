package kodlamaIoDemo2;

public class UserManager {
	
	
	public void add(User user) {           
		System.out.println("Kullan�c� eklendi  :"+user.getFirstName()+user.getLastName());
		
	}
	public void remove(User user) {  
		System.out.println("Kullan�c� silindi");
		
	}
	public void update(User user) { 
		System.out.println("Kullan�c� g�ncellendi");
		
	}


}
