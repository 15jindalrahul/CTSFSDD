package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int id;
	
	private String firstName;
	private String lastName;

	private String email;
	public Customer(String firstName, String lastName, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	

}
