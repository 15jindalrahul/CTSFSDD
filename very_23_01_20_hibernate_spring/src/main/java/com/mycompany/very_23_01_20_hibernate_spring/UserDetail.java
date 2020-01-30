package com.mycompany.very_23_01_20_hibernate_spring;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

/*
spring beans
spring core
spring orm
spring context
hibernate core
hibernate entity manager
spring jdbc
jpa
mysql
c3p0
project lombok
hibernate validator engine (latest version 6.1.1)

Step 1:
	define the datasource
	<bean id="myDataSource" class="com.mchange.v2.c3po.ComboPooledDataSource">


step 2:
	
	
	congiguring hibernate
	
	<bean id="SessionFacorty"
	class="org.springframework.orm.hibernate5.LocalSessionFactoryBean"

private  


*/

public class UserDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Length(min =8,max=15, message="invalid")
	private String userName;
	@Email(message="invalid password")
	private String email;
	

}
