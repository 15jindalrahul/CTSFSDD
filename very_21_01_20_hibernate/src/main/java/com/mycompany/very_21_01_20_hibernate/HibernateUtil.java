package com.mycompany.very_21_01_20_hibernate;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	
	private  static SessionFactory factory =null;
	{
		
	}
	static {
		
		Logger logger= Logger.getLogger("org.hibernate");
		logger.setLevel(Level.OFF);
		
		factory=new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();		
	}

		
	
	
	
	public  static Session getSession()
	{
		return factory.openSession();

}
}
