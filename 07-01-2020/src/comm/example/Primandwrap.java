
package comm.example;

public class Primandwrap {
	private  int pInt =10;
	private Integer wInt;
	public Primandwrap() {
		super();
		
	}
	
	public Primandwrap(int pInt, Integer wInt) {
		super();
		this.pInt = pInt;
		this.wInt = wInt;
	}

	@Override
	public String toString() {
		return "Primandwrap [pInt=" + pInt + ", wInt=" + wInt + "]";
	}
	public void display()
	{
		int tempP=wInt;//auto unboxing
		Integer tempW=pInt;//auto boxing
		System.out.println(this);
		System.out.printf("After Auto Boxing/unboxing: %d %d ",wInt,pInt);
	}
	
	




	
}
