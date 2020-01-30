package Shuffling;
import java.util.Collections;
import java.util.List;

import natural_OrderinginList.Mylist;

import java.util.ArrayList;
import java.util.Arrays;
public class Shuffle {
	
	private String[] str= {"e","v","d"};
			
	List<String> ls=new ArrayList<String>();
	
	public void sorted()
	{
	ls=Arrays.asList(str);     // when sorting in array that has value stored at each index,so here we cannot take
	                           //           add method
	
	
	
	System.out.println("before sorting");
	System.out.println(str);
	Collections.shuffle(ls);
	System.out.println("AFTER SORTING");
	System.out.println(ls);
	
	}
	public static void main(String[] args)
	{
		Shuffle l=new Shuffle();
		l.sorted(); 
		
		
		
		
		
	}
}


	
	
	
	
	


