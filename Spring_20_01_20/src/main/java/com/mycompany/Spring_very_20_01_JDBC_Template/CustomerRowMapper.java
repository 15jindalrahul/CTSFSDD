package com.mycompany.Spring_very_20_01_JDBC_Template;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		
		Customer c=new Customer();
		c.setCustomerId(rs.getInt("customerId"));
		c.setFirstName(rs.getString("firstname"));
		c.setSalary(rs.getInt("salary"));
		return c ;
	}

}
