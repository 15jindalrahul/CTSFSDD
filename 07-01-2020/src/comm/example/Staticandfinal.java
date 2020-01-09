package comm.example;

public class Staticandfinal {

	private String name;
	private static Integer count;
	private final int max;

	public Staticandfinal() {
		super();
		//initializing in constructor is mandatory 
		max=0;

	}

	public Staticandfinal(String name, int max) {
		super();
		this.name = name;
		this.max = max;
	}

	


	
	
	
	//initializing static attributes not mandatory
	
	static
	{
		count=0;
	}
	/*
	 * NESTED CLASS HERE TO LEARN ABOUT HOW TO CALL NESTED CLASS
	 * 
	 * 
	 */

	public class Nestedclass {
		private String last_name;

		public void add(int a, int b) {
         System.out.println("a+b");
		}

	}

	
	
// static member
public static  String display()

{
System.out.println("max");
return count.toString();

}

// non static member
public void displaymax()
{
	System.out.println("very nice");
}




}
