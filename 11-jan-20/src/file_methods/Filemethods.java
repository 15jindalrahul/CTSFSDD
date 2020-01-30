package file_methods;

import java.io.File;
import java.io.*;
import java.util.*;

public class Filemethods {

	public static void main(String[] args)
	
	{
		/*
		if(args.length<1)
		{
			System.out.println("provide dummyname");
	        return;
		}
		*/
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
	
		
		
		
		String  fileName=args[0];
		
    File fn=new File("abc.txt");
    try {
	 
	  fn.createNewFile();
        }
      catch(IOException e)
      {
    	  System.err.println();
      }
    System.out.println("Name: " + fn.getName());
      
      if(fn.exists())
      {
    	  System.out.println("file exists");
      }
	 
	 
      if (fn.canRead()) {
          System.out.println(fileName  + " is readable.");
      }
      
      System.out.println(fileName + " is " + fn.length() + " bytes long.");
      System.out.println(fileName + " is last modifed at " +
              new java.util.Date(fn.lastModified())) ;
      
      if (fn.canWrite()) {
          System.out.println(fileName  + " is writable.");
      } else{
          System.out.println(fileName  + " is not writable.");
      }
  }

    
	}
	
	
	


