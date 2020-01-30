package com.mycompany.maven_16_01_20;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App 

{

 private static CustomerService cs=null;
 private static Customer customer;

static {
cs=new CustomerServiceImpl();	
}
	

    public static void main(String[] args) throws Exception
    {
       
    	int choice =0;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
do
{
	System.out.println("1.create customer");
	System.out.println("2.display customer");
	System.out.println("3.add");
	System.out.println("4.delete");
	System.out.println("0.exit");
	
	choice = Integer.parseInt(in.readLine().toString());
	switch (choice) {
	case 1:
		System.out.print(" First Name: ");
		String fName=in.readLine().toString();
		System.out.print(" Last Name: ");
		String lName=in.readLine().toString();
		System.out.print(" Email: ");
		String email=in.readLine().toString();
		Customer c=cs.createCustomer(fName, lName, email);
		
		System.out.println("Create Customer Sucess "+c);
		break;
	case 0:
		System.exit(0);
		
	default:
		System.out.println("invalid choice");
		break;
	}

} while (choice != 0);

}

    
    


	
    	
    	
    	
    	
    	
}
