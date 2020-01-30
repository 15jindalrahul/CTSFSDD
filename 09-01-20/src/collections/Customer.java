package collections;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Customer {
	
	
	private Integer a;
	private String first_Name;
	private String last_Name;
	private String email_Id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((email_Id == null) ? 0 : email_Id.hashCode());
		result = prime * result + ((first_Name == null) ? 0 : first_Name.hashCode());
		result = prime * result + ((last_Name == null) ? 0 : last_Name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (email_Id == null) {
			if (other.email_Id != null)
				return false;
		} else if (!email_Id.equals(other.email_Id))
			return false;
		if (first_Name == null) {
			if (other.first_Name != null)
				return false;
		} else if (!first_Name.equals(other.first_Name))
			return false;
		if (last_Name == null) {
			if (other.last_Name != null)
				return false;
		} else if (!last_Name.equals(other.last_Name))
			return false;
		return true;
	}
	
	
	
	

}
