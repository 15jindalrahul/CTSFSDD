package com.mycompany.Spring_very_20_01_20_javaconfig.config;


/*
package com.mycompany.Spring_very_20_01_20_javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    //Annotations such as (@configurations,@ComponentScan) are added.Here we dont need to have applicationContext.xml file .
      // Instead we have CustomerConfig class where  in  package name of CustomerConfig class we have to give    .config    

@Configuration
@ComponentScan(basePackages = "com.mycompany.Spring_very_20_01_20_javaconfig")
public class CustomerConfig {
	
	
	
	

}


 */


                                             /* now using jdbc template and datasource */
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan(basePackages = "com.mycompany.Spring_very_20_01_20_javaconfig")
public class CustomerConfig {
	
	@Bean
	public DataSource dataSource(){
		return new DriverManagerDataSource("jdbc:mysql:localhost://3306","root","welcome");
				
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
	return new JdbcTemplate(dataSource());	
	}
}

