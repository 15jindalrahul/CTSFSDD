package model;


// dto stands for DATA  TRANSACTION OBJECT ,IT MEANS WE ARE ADDING ANOTHER LAYER OF ABSTRACTION TO OUR POJO CLASS/ENTITY CLASS.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDto {
	

	private String firstName;
	private String LastName;
	private String email;

}
