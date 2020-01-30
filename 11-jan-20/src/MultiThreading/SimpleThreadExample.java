package MultiThreading;




         /*                  simple thread example using interface runnable                          */


/*

public class SimpleThreadExample implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.format("%d", i);

		}

	}

	public static void main(String[] args)

	{

		SimpleThreadExample th = new SimpleThreadExample();
		Thread t1 = new Thread(th);
		t1.start();

	}

}
*/


/*                  simple thread example using extend Thread                               */
                                                                                        

public class SimpleThreadExample extends Thread
{

	@Override
	public void run() {
		
		super.run();
		
		for(int i=0;i<=20;i++)
		{
	System.out.println("priority:"+ getPriority());	
	
	}

	
	
	}	


public static void main(String[] args)

{

	SimpleThreadExample th = new SimpleThreadExample();
	Thread t1 = new Thread(th);
	t1.start();

}
}





























