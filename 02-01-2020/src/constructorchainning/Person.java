package constructorchainning;

public class Person {
	
	private String name;
	private int age;
	
	public Person()
	{
	this("john");	
		
		
	}
	public Person(String name)
	{
		this("john",34);
	}
	
	public Person(String name,int age)
	{
		this("john",34,167);
	}

	public Person(String name,int age,int Id)
	{
		
	}
}
