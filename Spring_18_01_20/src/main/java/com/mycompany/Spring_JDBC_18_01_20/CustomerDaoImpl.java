
package com.mycompany.Spring_JDBC_18_01_20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Dao")
public class CustomerDaoImpl implements CustomerDao {
	private Connection Conn ;
	private PreparedStatement pStatement;
	private DataSource dataSource;
	private static Logger logger = Logger.getLogger("Spring_JDBC.CustomerDaoImpl");
@Autowired
	public CustomerDaoImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
		System.out.println(dataSource);
	}
@PostConstruct
	public void init()
	{
	 

	try

	{
		logger.info("connection created");
		Conn = dataSource.getConnection();
		logger.info("connection established");
	}catch(
	Exception e)
	{
		logger.info("connection not created");
		e.printStackTrace();
	}


		
		
}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		System.out.println(customer);
		pStatement=Conn.prepareStatement("insert into customer( customerId, firstName, salary) values(?,?,?)");
		  pStatement.setInt(1,customer.getCustomerId());
		  pStatement.setString(2, customer.getFirstName());
		  pStatement.setInt(3,customer.getSalary());
		  pStatement.executeUpdate();
			
		return customer ;
	}

}
