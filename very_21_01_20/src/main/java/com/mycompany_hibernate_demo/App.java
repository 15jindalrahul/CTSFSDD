

package com.mycompany_hibernate_demo;


import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        try {
    	SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session =factory.openSession();
    	System.out.println("creating");
    	
    	Person p=new Person("101","rahul");
    	System.out.println(p);
    	session.getTransaction().begin();;
    	session.save(p);
    	session.getTransaction().commit();
    	System.out.println("done");
    	
    	
    	
    	
    }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
}
}











