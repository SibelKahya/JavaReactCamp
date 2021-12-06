package kodlamaIoDemo2;

public class UserManager {
	
	
	public void add(User user) {           
		System.out.println("Kullanýcý eklendi  :"+user.getFirstName()+user.getLastName());
		
	}
	public void remove(User user) {  
		System.out.println("Kullanýcý silindi");
		
	}
	public void update(User user) { 
		System.out.println("Kullanýcý güncellendi");
		
	}


}
