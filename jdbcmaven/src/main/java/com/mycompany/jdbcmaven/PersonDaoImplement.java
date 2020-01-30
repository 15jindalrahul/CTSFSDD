package com.mycompany.jdbcmaven;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImplement implements PersonDao {

	 private Statement st=null;
	  private MySqlConnection myConnection=null;
	 private Connection Conn = null;
	 
	 List<Person> lt=null;
	 
	 {
			myConnection = MySqlConnection.getMyConnectionObject();
			try {
				Conn = myConnection.getMyConnection();
				lt = new ArrayList<Person>();
			} catch (SQLException e) {

				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	 
	 
	 // define method where sql query will take place
	
	@Override
	public List<Person> getDetails() throws SQLException {
		st = Conn.createStatement();
		ResultSet rs=st.executeQuery("select food_Id,food_name,calorie from food");
		while(rs.next())
		{
		
		lt.add(new Person(rs.getInt("food_Id"),
		rs.getString("food_name"),
		rs.getInt("calorie")));
		}
		return lt;
		
		
		
		
		
	}

	
	
	

}

