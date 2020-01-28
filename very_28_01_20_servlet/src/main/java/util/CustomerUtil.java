package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Customer;

public class CustomerUtil {
	
 private static SessionFactory factory=null;
 public static SessionFactory getMySession()
 {
	 
	 factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
	 
	 
	return  factory;
	 
 }


/*	
 <%
 any kind of java code to write here
scripplet
%>

*/
}
