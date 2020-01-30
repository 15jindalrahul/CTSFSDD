package com.mycompany.myproject;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString



public class Employee implements Serializable  {
	private static final long serialVersionUID = -9120447908472833000L;
	
	
	private int  employee_Id;
	private String first_Name;
	private double salary;
	
	
	
//  here without lombok we have made constructor as we are making program in MAVEN
	
	
	
	}
	
	
	
	
	
	
	
	
	

	


