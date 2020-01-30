package com.mycompany.Spring_very_20_01_JDBC_Template;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer) throws SQLException;
	
	
	public List<Customer> getAllCustomers() throws SQLException;

}
