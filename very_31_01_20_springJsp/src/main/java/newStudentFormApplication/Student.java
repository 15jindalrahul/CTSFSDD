package newStudentFormApplication;

import java.util.LinkedHashMap;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.sun.istack.internal.NotNull;



public class Student {
	@NotNull
	@Size(min=4,max=8,message="bteween 4 and 8")
	private String firstName;
	
	private String lastName;
	@Range(min=8,max=15,message="enter age betwwen 8 and 15")
	private int age;
	
	
	@Pattern(regexp="([0-9]{6}|[0-9]{3}\\s[0-9]{3})",message="enter correct postal or zip code")
    private int zipCode;
	
	private String favLanguages;
	private String[] operatingSystems;
	
   private LinkedHashMap<String,String> countryOptions;
	
	



	public Student(){
	
	
	countryOptions=new LinkedHashMap<>();
	countryOptions.put("ind", "india");
	countryOptions.put("uk", "uk");
	countryOptions.put("fr", "france");

	countryOptions.put("us", "usa");

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




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getZipCode() {
		return zipCode;
	}




	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}




	public String getFavLanguages() {
		return favLanguages;
	}




	public void setFavLanguages(String favLanguages) {
		this.favLanguages = favLanguages;
	}




	public String[] getOperatingSystems() {
		return operatingSystems;
	}




	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
	
	
	
	
	
	
}
