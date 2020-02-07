package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	
	
	
}


/*
 
Spring Boot(Spring starter project)  :   Here we dont need to add dependency from maven repository i.e from google.
                                         At the beginning only it will ask to  add dependency name.
                    

Maven project                        :  Here u need to add dependency from maven repository i.e from google





Q why we are using springBoot 
Ans 
because:

1 perform auto configuration based on props files,and jar classpath
2 minimize amount of manual configuratiom
3 makes it easier to get started with spring development
4 to resolve dependcy conflicts(maven or gradle)
5 provide an embedde http server so u can get stared quickly(tomcat,jetty,undertow these are embedded server)



// here we will have main method also, for server
 
*/




/*               Dependency to add (internally)
 *  spring web
 *  h2 database
 *  lombok
 *  spring data jpa
 *  
 *  
 *  
 *                Dependency to add(by maven)
 *  jstl(both)
 *  
 *  
 *               Dependency to copy
 *  <dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>


		<dependency>
			<groupId>org.eclipse.jdt.core.compiler</groupId>
			<artifactId>ecj</artifactId>
			<version>4.6.1</version>
			<scope>provided</scope>
		</dependency>

		<!-- Optional, test for static content, bootstrap CSS -->
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>3.3.7</version>
		</dependency> 

   
 */


