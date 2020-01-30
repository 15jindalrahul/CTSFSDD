package com.mycompany.very_21_01_20_hibernate;

import java.util.List;

public interface PersonDao {
	
	public Person createPerson(Person person);
	
	public List<Person> getAllPersons(Person person);
	public Person getById(Integer id);
	public Person updatePerson(Integer id);
	public Person deletePerson(Integer id);
}
