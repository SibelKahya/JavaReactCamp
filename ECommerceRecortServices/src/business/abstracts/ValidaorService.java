package business.abstracts;

public interface ValidaorService {
	
	boolean validateName(String name);
	boolean validateSurname(String firstName);
	boolean validateMailAddress(String mailAddress);
	boolean validatePssword(String password);
	boolean validateClicked(boolean isClicked);

}
