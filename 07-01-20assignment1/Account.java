package comm.example;

public class Account {
	
	private int paccount_id;
	private Integer waccount_id;
	private String name;
	private String address;
	


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Account(int paccount_id, Integer waccount_id, String name, String address) {
		super();
		this.paccount_id = paccount_id;
		this.waccount_id = waccount_id;
		this.name = name;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Account [paccount_id=" + paccount_id + ", waccount_id=" + waccount_id + ", name=" + name + ", address="
				+ address + "]";
	}
	
	
	
	
	
	public boolean equals(Object obj)
	{
		
		if(obj instanceof Savingsaccount)
		{
			
		}
		
		if(obj instanceof Currentaccount)
		{
			int choice;
			switch(choice)
			case 1:
				if()
				
			
		}
	}
	
	
	
	
	
	
}




