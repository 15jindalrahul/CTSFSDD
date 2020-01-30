package com.mycompany.maven_16_01_20;

import java.sql.SQLException;

public interface CustomerDao {
	
	
	public Customer createCustomer(String firstName,String lastName,String email) throws SQLException;


}
