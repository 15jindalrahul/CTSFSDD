package serialization;//serialization name is just for understanding


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {
	
	private String First_Name;
	private String last_Name;
	private String email_Id;
	
	
	
	public Employee(String first_Name, String last_Name, String email_Id) {
		super();
		First_Name = first_Name;
		this.last_Name = last_Name;
		this.email_Id = email_Id;
	}
	

	
	
	
	
	
	
}
