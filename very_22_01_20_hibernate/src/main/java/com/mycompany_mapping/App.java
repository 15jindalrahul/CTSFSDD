package com.mycompany_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mycompany_one_to_one_unidirectional.Task;
import com.mycompany_one_to_one_unidirectional.ToDo;

// for one-to- one mapping ,uncomment it and run it

public class App {
	public static void main( String[] args )
    {
		
		Transaction transaction=null;
		try {
			
			
      SessionFactory factory=new Configuration().configure().addAnnotatedClass(ToDo.class).addAnnotatedClass(Task.class).buildSessionFactory();
      Session session=factory.openSession();
      ToDo todo=new ToDo(101,"abc");
      todo.setTask(new Task("def"));
    
      session.getTransaction().begin();
  
      session.save(todo);
      session.getTransaction().commit();
      
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    }
}



