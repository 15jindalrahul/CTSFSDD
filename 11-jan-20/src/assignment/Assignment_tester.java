package assignment;
import java.util.List;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;


public class Assignment_tester {
	public static void main(String[] args)
	
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enetr no of employees");
		
		
		int a=Integer.parseInt(br.readLine());
		
		List<Employee> lt=new ArrayList<Employee>();
		for(int i=0; i<=a;i++)
		{
			
			
			String name=br.readLine();
			
			String department=br.readLine();
		java.util.Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			int age=Integer.parseInt(br.readLine());
			int salary=Integer.parseInt(br.readLine());
			Employee e=new Employee(name,department,dateOfJoining,age,salary);
			lt.add(e);
		}
			System.out.println("1.Sort employees by salary");
			System.out.println("2.Sort employees by age and by date of joining");
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				Collections.sort(lt);
				EmployeeBO.printDetails(lt);
				break;
			case 2:
				Collections.sort(lt,new Agecomparator());
				EmployeeBO.printDetails(lt);


			}
		}

	
			
			
			
		
		
		
	}
		


