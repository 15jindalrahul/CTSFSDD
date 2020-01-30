package com.mycompany.very_21_01_20_hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDaoImpl implements PersonDao {
    Session session=null;
  
    {
		session=HibernateUtil.getSession();
		
    }
	@Override
	public Person createPerson(Person person) {
		try {
			
			session.getTransaction().begin();
			session.save(person);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return person;
	}

	@Override
	public List<Person> getAllPersons(Person person) {
		
		return null;
	}

	@Override
	public Person getById(Integer id) {
		
		return null;
	}

	@Override
	public Person updatePerson(Integer id) {
		
		return null;
	}

	@Override
	public Person deletePerson(Integer id) {
		
		return null;
	}

}
