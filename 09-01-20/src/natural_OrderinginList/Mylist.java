package natural_OrderinginList;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;



public class Mylist {
	/*
	private List<String> ls=null;
	{
		ls=new LinkedList<String>();
	}
*/
	
	// or u can declare list as done below
	
	 List<String> ls=new LinkedList<String>();
	
	public void sortedlist()
	{
		
		ls.add("boston");
		ls.add("America");
		ls.add("india");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		
		
	}
	public static void main(String[] args)
	{
		Mylist l=new Mylist();
		l.sortedlist();
		System.out.println("before sorting");
		
	}
	
	
	
	
}

