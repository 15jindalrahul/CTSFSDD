package comm.example;

import lombok.*;
    
public class Coach {
	private String coachId;
	private String firstName;
	private String lastName;

	/* GETTER AND SETTER */

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coach(String coachId, String firstName, String lastName) {
		super();
		this.coachId = coachId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Coach [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coachId == null) ? 0 : coachId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		
		Coach thecoach=null;
		boolean isEquals=false;
		if(obj instanceof Coach)
		{
			thecoach=(Coach)obj;
		
		}
		if((this.getFirstName() == thecoach.getFirstName())&&(this.getLastName() == thecoach.getLastName()));
		{
			
			isEquals=true;
		
		}
		return isEquals;
		
	}

}
