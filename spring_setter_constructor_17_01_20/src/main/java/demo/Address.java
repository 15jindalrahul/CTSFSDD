package demo;




/*                                                 without annotations                           */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Address {
	
	private String addressLine1;
	
	private String addressLine2;
	private String addressLine3;
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressLine3="
				+ addressLine3 + "]";
	}


}


