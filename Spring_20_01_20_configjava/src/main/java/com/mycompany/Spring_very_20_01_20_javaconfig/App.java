package com.mycompany.Spring_very_20_01_20_javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.Spring_very_20_01_20_javaconfig.config.Customer;
import com.mycompany.Spring_very_20_01_20_javaconfig.config.CustomerConfig;

public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
      
      Customer c=context.getBean("customer",Customer.class);
      c.setCustomerId(100);
      c.setFirstName("John");
     
      c.setSalary(5000);
      System.out.println(c);
   	
   }
    
      
    }

