package com.mycompany.Spring_very_20_01_JDBC_Template;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao d;
	
	
	
@Autowired
	public CustomerServiceImpl(CustomerDao d) {
		super();
		this.d = d;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return d.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		return d.getAllCustomers();
	}

}
