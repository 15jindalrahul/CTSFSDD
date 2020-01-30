package finaland_Exception;

public class Exception {
	public static void main(String[] args) {

		private int count = 0;

		try {

			while (true) {
				if (count == 0)
			 throw new Myexception("Exception occured");
			}
		} catch (Myexception e) {
			System.out.println("error occured");
		} finally {
			System.out.println("final block");
			if (count == 2)
				break;
		}
	}

}
