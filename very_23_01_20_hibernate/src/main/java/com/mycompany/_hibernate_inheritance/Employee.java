package com.mycompany._hibernate_inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="perm_or_Contra", discriminatorType = DiscriminatorType.STRING) 
@DiscriminatorValue("true_or_false")
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

private String empName;

public Employee(int id, String empName) {
	super();
	this.id = id;
	this.empName = empName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}


	

}
