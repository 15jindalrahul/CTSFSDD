package com.mycompany._hibernate_inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {try
    
    {
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(ContractEmployee.class).addAnnotatedClass(PermanentEmployee.class).buildSessionFactory();
    	Session session=factory.openSession();
    	Employee e1=new Employee(101,"abc");
    	Employee e2=new ContractEmployee();
    	Employee e3=new Employee(301,"abc");
    	session.getTransaction().begin();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.getTransaction().commit();
		System.out.println("done");
	} finally {
    	
    	
    	
    	
    	
    }
   
		
	}
}

