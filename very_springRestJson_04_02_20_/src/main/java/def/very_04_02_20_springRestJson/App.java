package def.very_04_02_20_springRestJson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args )
    {
      

    	// here we are converting json to java.
		try {
			ObjectMapper mapper=new ObjectMapper();
	    
	    	Student s = mapper.readValue(new File("student.json"),Student.class);
			System.out.println(s);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
    	
    	
}
    
    
   
    
    
    
    
}
