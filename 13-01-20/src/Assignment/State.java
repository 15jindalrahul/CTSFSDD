package Assignment;
import util.Comparable;

public class State implements Comparable {
	
	
	 private String name;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Country c=null;
		c=(Country)o;
		if(c.getCname()|.getStatename())
		{
			
		}
		
		return 0;
	}
	 
	 
	 
	

}
