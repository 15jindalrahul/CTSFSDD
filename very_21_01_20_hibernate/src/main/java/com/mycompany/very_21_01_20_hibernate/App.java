package com.mycompany.very_21_01_20_hibernate;

import java.time.LocalDate;
import java.util.UUID;

public class App {
	static PersonService ps = null;
static{
	      
	      ps = new PersonServiceImpl(); 
}
	       
	  

	public static void main( String[] args )
	{   
    
    Person p=new Person("112", "aa", LocalDate.now());
    System.out.println(ps.createPerson(p));
}
}
