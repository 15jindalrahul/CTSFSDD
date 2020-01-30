package com.mycompany.very_21_01_20_hibernate;

import java.util.List;

public class PersonServiceImpl implements PersonService {
	PersonDao dao;
	{
		dao= new PersonDaoImpl();
	}

	@Override
	public Person createPerson(Person person) {
		
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPersons(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person updatePerson(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person deletePerson(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
