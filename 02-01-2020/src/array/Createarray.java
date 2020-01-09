package array;

public class Createarray {

	private char[] s;
	private char[] a;
	private String str = "HELLO WORLD";

	/*
	 * default initializer { s = new char[26]; }
	 */
	public char[] myarray() {
		for (int i = 0; i < s.length; i++)

			s[i] = (char) ('A' + i);
		return null;

	}

	public void convert(String str)

	{

		{
			a = str.toCharArray();
		}

	}

	public void displaystring() {
     
		for(char b:a)
			System.out.println(b);
		{
			
		}
		
	}
/*
	public void displayarray() {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}

	}
	*/
}
