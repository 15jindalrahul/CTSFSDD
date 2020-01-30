

// this is for bi directinal or Many-to-Many (line 13-26) run it,and check in  mysql 

/*
package com.mycompany_mapping_bidirectional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		  // for creation of values
		  
		  try { SessionFactory factory=new
		  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ToDo1.class)
		  .addAnnotatedClass(Task1.class).buildSessionFactory(); Session
		  session=factory.openSession(); ToDo1 todo=new ToDo1(101,"abc");
		  todo.setTask(new Task1("def"));
		  
		  session.getTransaction().begin();
		  
		  session.save(todo); session.getTransaction().commit(); }catch(Exception e) {
		  e.printStackTrace();
		  }
	}
}


*/
                                                   // for deleting using ToDo1 class  






package com.mycompany_mapping_bidirectional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		try {
			

			int id = 1;
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ToDo1.class)
					.addAnnotatedClass(Task1.class).buildSessionFactory();
			Session session = factory.openSession();

			session.getTransaction().begin();

			ToDo1 todo = session.get(ToDo1.class, id);

			System.out.println("FoundToDo1: ");

			session.getTransaction().commit();

			System.out.println("Done!");

			if (todo != null) {
				System.out.println("deleting");
				session.delete(todo);
				session.getTransaction().commit();

				System.out.println("Done!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

	





//                           deleting using task1 class
/*	
package com.mycompany_mapping_bidirectional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
	
	try {

	int id=1;
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ToDo1.class).addAnnotatedClass(Task1.class).buildSessionFactory();
	
		Session session =factory.openSession(); 
		session.getTransaction().begin();
		
	     Task1 t=session.get(Task1.class,id); 	
		session.delete(t);
		session.getTransaction().commit();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
}
}



*/


