package Kodlamaio.HrmsProject2.core.utilities.Verification;

import org.springframework.stereotype.Service;

import Kodlamaio.HrmsProject2.entities.concretes.User;

@Service
public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isVerified(User user) {
	
		return true;
	}

}
