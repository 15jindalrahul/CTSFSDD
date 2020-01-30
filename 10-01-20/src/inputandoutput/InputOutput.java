
/*for byte stream,we use InputStream and OutputStream
package inputandoutput;

import java.io.*;
public class InputOutput {
	public static void main(String[] args) throws IOException{
		
		File inputFile=null;
		File outputFile=null;
		FileInputStream in=null;
		FileOutputStream out =null;
		
		
		
		try {
			inputFile=new File("abc.txt");
			outputFile=new File("def.txt");
			
			in=new FileInputStream(inputFile);
			out=new FileOutputStream(outputFile);
			
			int b;
			
			while((b=in.read())!=-1) 
			{
				System.out.println(b);
			out.write(b);	
			}
			
			
			
			System.out.println("writing into def file");
		}
		finally {
			in.close();
			out.close();
		}
	}

}

*/





/*             for char stream,we use FileReader and FileWriter                                 */



package inputandoutput;

import java.io.*;
public class InputOutput {
	public static void main(String[] args) throws IOException{
		
		File inputFile=null;
		File outputFile=null;
		FileReader in=null;
		FileWriter out =null;
		
		
		
		try {
			inputFile=new File("abc.txt");
			outputFile=new File("def.txt");
			
			in=new FileReader(inputFile);
			out=new FileWriter(outputFile);
			
			int c;
			
			while((c=in.read())!=-1) 
			{
				System.out.println((char)c);
			out.write(c);	
			}
			
			
			
			System.out.println("writing into def file");
		}
		finally {
			in.close();
			out.close();
		}
	}

}













