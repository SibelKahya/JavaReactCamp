package Kodlamaio.HrmsProject.dataAcces.abstrcats;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.HrmsProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
	JobPosition findByJobName(String jobName);

}
