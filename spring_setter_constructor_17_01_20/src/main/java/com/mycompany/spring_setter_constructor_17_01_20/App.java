package com.mycompany.spring_setter_constructor_17_01_20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.Employee;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee emp=context.getBean("emp",Employee.class);
    	System.out.println(emp);
    }
}
