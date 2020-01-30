package com.mycompany.maven_16_01_20;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.*;
import java.util.logging.Level;
public class CustomerDaoImpl implements CustomerDao {

	private PreparedStatement pStatement = null;
	static Logger logger = Logger.getLogger("com.mycompany.maven_16_01_20.CustomerDaoImpl");
	private MyConnectionFactory factory = null;
	private Connection connection=null;
	private Customer c=null;
	{
	factory=MyConnectionFactory.getFactoryObject();
	try
	{
		connection = factory.getMyConnection();
		logger.info("ok");
	}catch(IOException|SQLException e)
	{
	
		logger.log(Level.WARNING, e.toString());
	}
	}
	@Override
	public Customer createCustomer(String firstName, String lastName, String email) throws SQLException {
		
		c=new Customer(firstName,lastName,email);
		
		pStatement=connection.prepareStatement("insert into "
		+"Customer( String firstName,String lastName,String email)"
				+"values(?,?,?)");
		
		pStatement.setString(1,c.getFirstName());
		pStatement.setString(1,c.getLastName());
		pStatement.setString(1,c.getEmail());
		return  c;
	}

}
