package com.mycompany.maven_16_01_20;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
	
	
	
	
		private CustomerDao dao;
		{
			dao=new CustomerDaoImpl();
		}

	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		
		return null;
	}
	
	
	

}
