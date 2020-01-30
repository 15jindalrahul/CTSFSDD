package jdbc_h2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnectionFactory {
	
	 static MyConnectionFactory myConnection=null;
	 private Connection Conn=null;
	 
	 
	 
	public MyConnectionFactory() {
		super();
	}


public static MyConnectionFactory getMyconnectionObject()
{
	if(myConnection == null)
		
		
	{
		myConnection =new MyConnectionFactory();
	}
	return myConnection;
			
}



	public Connection getConnectionObject() throws SQLException,IOException

{
	
	InputStream in=new FileInputStream("h2.properties");
	Properties prop=new Properties();
	prop.load(in);
	
	String url= prop.getProperty("h2.Conn.url");
	String user=prop.getProperty("h2.Conn.user");
	String pass=prop.getProperty("h2.Conn.pass");
	
	
	
     	Conn=DriverManager.getConnection(url,user,pass);

      return Conn;


}





}






