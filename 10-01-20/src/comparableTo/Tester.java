package comparableTo;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class Tester  {
	
	public static void main(String[] args)throws Notvaliname 
	{
		
		Set<Student> st=null;
		{
			st=new TreeSet<Student>();
			
		}
		
		
		st.add(new Student(101,9.8,"abcdhfhJARJGH","cde"));
		st.add(new Student(102,10.8,"abcGFBADGJUQHG","cde"));
		st.add(new Student(105,6.0,"abc","cde"));
		
		for(Student sts:st) {
			System.out.println(sts);
		}
		
		
		
		
		
		
	}

}
