package serialization;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutputStream {

	BufferedReader br = null;
	BufferedWriter bw = null;

	List<Employee> ls = null;
	{
		ls = new ArrayList<Employee>();
	}

	try
	{
	
	br=new BufferedReader(new FileReader("employee.in.txt"));
	String line=reader.readline();
	
	while(line!=null)
	{
	String[] str=line.split(",");
	
	emp = new Employee(str[0], str[1]);
	
	list.add(emp);
	line = reader.readLine();
	
	
	catch(Exception e) {
	e.printStackTrace();
		
	}
	
	try {
     FileOutputStream out= new FileOutputStream(employee.out.txt);
	 ObjectOutputStream oos=new ObjectOutputStream(out);
	  
	oos.WriteObject(out);
	
	
	catch(Exception e)
	{
		System.out.println(problem occured);}

	try{

	FileInputStream in = new FileInputStream(employee.out.txt);
	ObjectInputStream ois = new ObjectInputStream(in);

	catch(
	Exception e)
	{
			
		
}

}


