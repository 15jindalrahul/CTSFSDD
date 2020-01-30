package com.mycompany.myproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {

	private  static MyConnection myConnection = null;
	private Connection Conn = null;

	public MyConnection() {
		super();
	}

	public  static MyConnection getMyConnectionObject() {
		if (myConnection == null)

		{
			myConnection = new MyConnection();
		}
		return myConnection;

	}

	
	
	
	
	
	
	public Connection getmyConnection() throws SQLException,IOException
	{
		
		InputStream in=new FileInputStream("abc.txt");
		
		Properties prop =new Properties();
		prop.load(in);
		
		Conn=DriverManager.getConnection(prop.getProperty("Conn.url"),prop.getProperty("Conn.user"),prop.getProperty("Conn.pass"));
		return Conn;
		
	}
}
