package com.mycompany.Spring_very_20_01_JDBC_Template;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
	
	
	CustomerService cs=null;
    public static void main( String[] args )
    {
       try {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	CustomerDao d=context.getBean("Dao",CustomerDao.class);
    	Customer ct=new Customer(501,"rahul",900000);
    	d.createCustomer(ct);
    	System.out.println(ct);
    	CustomerService cs=context.getBean("service",CustomerService.class);
	/*
	      Customer ct1=new Customer(601,"saurav",4000000);
		  cs.createCustomer(ct1);
		  System.out.println(ct1);
		*/  
		  
		  List<Customer> l= cs.getAllCustomers();
		  System.out.println(l.isEmpty());
		  l.forEach(c->{
			  System.out.println(c);
		  });
		  
		  
		 
    	
    }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }

	
}
}
