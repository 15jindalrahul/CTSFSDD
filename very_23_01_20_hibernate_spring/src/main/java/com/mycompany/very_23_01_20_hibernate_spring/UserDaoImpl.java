package com.mycompany.very_23_01_20_hibernate_spring;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

// here we will use annotations @Repository

@Repository("dao")
public class UserDaoImpl implements UserDao {
	 private Session session ;
	 
	 
	 
	public UserDetail createDetail(UserDetail user) {
		
		 
		
		
		
		
		return null;
	}



	public UserDaoImpl(Session session) {
		super();
		this.session = session;
	}

}
