package com.mycompany._hibernate_inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("permanentEmployee")
public class PermanentEmployee extends Employee {
	
	
	

	private String pName;
   private int salary;
   
   
   
public PermanentEmployee(int id, String empName) {
	super(id, empName);
}
public PermanentEmployee(int id, String empName, String pName, int salary) {
	super(id, empName);
	this.pName = pName;
	this.salary = salary;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}  
	
		
		
		
	}
    
    

