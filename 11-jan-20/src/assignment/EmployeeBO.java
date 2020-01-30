package assignment;

import java.util.List;

import java.text.SimpleDateFormat;

public class EmployeeBO {
	
	public static void printDetails(List<Employee> ls)
	{
		
		
	System.out.format( "%-15s %-30s %-30s %-10s %-10s\n","id","name","department","DateofJoinning","age","salary");	
	
	for(Employee e:ls)
	{
		System.out.println(e);
	}
	
	}

}
