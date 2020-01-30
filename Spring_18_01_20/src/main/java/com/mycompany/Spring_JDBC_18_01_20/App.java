package com.mycompany.Spring_JDBC_18_01_20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*                                            this program is using jdbc spring not jdbc template                      */

public class App 
{
    public static void main( String[] args )
    {
    try {	
     ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
     CustomerDao d=context.getBean("Dao",CustomerDao.class);
     System.out.println(d);
     Customer c=d.createCustomer(new Customer(102, "Doe", 5000));
     System.out.println(c);
     
    }
    catch(Exception e){
    	e.printStackTrace();
    }
    	
    }
}
