package com.mycompany_mapping_one_to_many;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
     try {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ToDo2.class).addAnnotatedClass(MTask.class).buildSessionFactory();
		Session session=factory.openSession();
		
		session.getTransaction().begin();
		List<MTask> lt=new LinkedList<MTask>();
	     
		ToDo2 todo=new  ToDo2(2001,"abc",lt);
		session.save(todo);
		session.getTransaction().commit();
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
