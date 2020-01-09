package comm;

public abstract class Transport {
	
	private double eff;
	private double start,end;
	private double initialFuel;
	private double leftFuel;
	
	
	
	public double getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public double getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public double getInitialFuel() {
		return initialFuel;
	}
	public void setInitialFuel(int initialFuel) {
		this.initialFuel = initialFuel;
	}
	public double getLeftFuel() {
		return leftFuel;
	}
	public void setLeftFuel(int leftFuel) {
		this.leftFuel = leftFuel;
	}
	
	
	
	public  abstract void calDistance();
	public abstract void calFuelEfficiency();
	
	

	

}
