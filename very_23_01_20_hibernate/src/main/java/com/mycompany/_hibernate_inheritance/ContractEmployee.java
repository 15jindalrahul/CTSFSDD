package com.mycompany._hibernate_inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Contractual")
public class ContractEmployee  extends Employee{
	
	private String cName;
    private int hourSalary;
    
    
    
    
	public ContractEmployee(int id, String empName) {
		super(id, empName);
	}

	public ContractEmployee(int id, String empName, String cName, int hourSalary) {
		super(id, empName);
		this.cName = cName;
		this.hourSalary = hourSalary;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getHourSalary() {
		return hourSalary;
	}
	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}
	
    
    
    

}
