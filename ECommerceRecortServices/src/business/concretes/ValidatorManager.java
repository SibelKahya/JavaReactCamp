package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.ValidaorService;

public class ValidatorManager implements ValidaorService {

	@Override
	public boolean validateName(String name) {
		if(name.length()<2) {
			
			System.out.println("Adiniz 2 karakterden kucuk olamaz !");
			return false;
			
		}else {
			return true;
		}
		
		
	}

	@Override
	public boolean validateSurname(String firstName) {
		
		if(firstName.length()<2) {
			
			System.out.println("Soyadiniz 2 karakterden kucuk olamaz !");
			return false;
			
		}else {
			return true;
		}
		
	
	}
	
	@Override
	public boolean validateMailAddress(String mailAddress) {
		
		String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
		Pattern emailPath=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=emailPath.matcher(mailAddress);
		return matcher.find();
		
	}

	@Override
	public boolean validatePssword(String password) {
	  if(password.length()<6) {
		  System.out.println("parola en az 6 karakter olmalýdýr !");
		  return false;
		  
	  }else {
		  return true;
	  }
		
	}

	@Override
	public boolean validateClicked(boolean isClicked) {
		
		return isClicked;
	}

	

}
