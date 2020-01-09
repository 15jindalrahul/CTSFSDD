package test;

public class Testerr {
	public static void main(String[] args)
	{
		Todo todo=new Todo();
		todo.createTodo("john","a",false);
		
		System.out.println(todo.gettododetails());
		
	}

}
