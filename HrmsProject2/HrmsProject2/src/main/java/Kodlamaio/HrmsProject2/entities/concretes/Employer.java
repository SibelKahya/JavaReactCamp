package Kodlamaio.HrmsProject2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
@EqualsAndHashCode(callSuper=false)
public class Employer extends User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name", nullable=false)
	private String companyName;
	
	@Column(name="web_address",nullable=false)
	private String website;
	
	@Column(name="phone_number",nullable=false)
	private String phoneNumber;

	
	
	
	

}




