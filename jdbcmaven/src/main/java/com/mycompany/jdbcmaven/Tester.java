package com.mycompany.jdbcmaven;

import java.sql.SQLException;
import java.util.List;

public class Tester {
	PersonDaoImplement pd= new PersonDaoImplement();
	public static void main(String[] args) throws SQLException {
		
   
		Tester t=new Tester();
		List<Person> lt= t.pd.getDetails();
		System.out.println(" FOOD ID  FOOD_NAME  CALORIE  ");
		lt.forEach(e->{
			System.out.println(e.getFood_Id()+"  "+e.getFood_name()+"  "+e.getCalorie());
		});

	}

	

		
	}


