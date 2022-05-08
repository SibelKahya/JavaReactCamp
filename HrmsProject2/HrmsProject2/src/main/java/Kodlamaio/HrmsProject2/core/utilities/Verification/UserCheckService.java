package Kodlamaio.HrmsProject2.core.utilities.Verification;

import Kodlamaio.HrmsProject2.entities.concretes.User;

public interface UserCheckService {
	
	boolean isVerified(User user);

}
