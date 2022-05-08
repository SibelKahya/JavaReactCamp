package Kodlamaio.HrmsProject2.dataAcces.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Kodlamaio.HrmsProject2.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	
	Candidate findByEmail(String email);
	
	Candidate findByIdentityNumber(String identityNumber);
	
	@Query("From Candidate where firstName=:firstName")
	List<Candidate> getByCandidateName(String firstName);
	
	
	

}
