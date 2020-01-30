package com.mycompany.Spring_JDBC_18_01_20;

import java.sql.SQLException;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;

}
