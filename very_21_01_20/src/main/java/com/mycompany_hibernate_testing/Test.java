package com.mycompany_hibernate_testing;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany_hibernate_using_annotations.ToDo;

public class Test {
	public static void main(String[] args) {
		Session session=null;
		SessionFactory factory=null;
		try
		{
			
		 factory=new Configuration().configure().addAnnotatedClass(ToDo.class).buildSessionFactory();
				 session=factory.openSession();
			ToDo todo =new ToDo();
			   
				session.getTransaction().begin();
				todo.setUId(UUID.randomUUID().toString());
				todo.setCreationLocalDate(LocalDate.now());
				todo.setToDoName("abc");
				
				session.save(todo);
				session.getTransaction().commit();
		
		
		

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
			
		}
		

}
	
	
	}



