package com.mycompany.jdbcmaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

import java.sql.DriverManager;

public class MySqlConnection {

	static MySqlConnection myConnection;
	private Connection Conn;

	private MySqlConnection() {

	}

	public static Properties getMyProperties() throws IOException,SQLException {

		InputStream in = new FileInputStream("my.Properties");

		Properties prop = new Properties();
		prop.load(in);

		return prop;

	}

	public static MySqlConnection getMyConnectionObject() {
		if (myConnection == null) {
			myConnection = new MySqlConnection();

		}
		return myConnection;
	}
	
	
	
	
// for data encapsualtion ,as we do not want to show username and password to any body,we have created a file my.properties
	//and putted username and password in that file
	
	

	public Connection getMyConnection() throws SQLException,IOException {
		
		
		Properties prop=getMyProperties();
		String url=prop.getProperty("jdbc.connection.url");
		String user=prop.getProperty("jdbc.connection.user");
		String pass=prop.getProperty("jdbc.connection.pass");
		

		Conn = DriverManager.getConnection(url,user,pass);
		

		return Conn;
	}
}
