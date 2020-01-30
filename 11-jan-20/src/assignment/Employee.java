package assignment;

import java.text.SimpleDateFormat;



public class Employee   implements Comparable{
	

	private int id;
	private String name;
	private String department;
	private SimpleDateFormat dateOfJoining;
	private int age;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String department, SimpleDateFormat  dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public  SimpleDateFormat getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining( SimpleDateFormat dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	@Override
	public String toString() {
		System.out.format("%-15s %-30s %-30s %-10s %-10s\n",id,name,department, new Simpledateformat("MM/DD/YYYY").format(),salary);
		return "";
	}

	@Override
	public int compareTo(Object o) {
		
		 Employee emp=null;
		if(o instanceof emp )
		{
			emp=(Employee)o;
		}
		if(this.getSalary()>emp.getSalary())
		{
			return 1;
		}
		
		if(this.getSalary()<emp.getSalary())
		{
			return -1;
		}
		if(this.getSalary()==emp.getSalary())
		return 0 ;
	}


}
