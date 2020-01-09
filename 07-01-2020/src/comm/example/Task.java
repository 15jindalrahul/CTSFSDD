package comm.example;

public class Task {
	
	private String task_Id;
	private String taskName;
	
	private String taskDate;
	
	private boolean isCompleted;
	
	
	public Task()
	{
		super();
	}


	public Task(String task_Id, String taskName, String taskDate, boolean isCompleted) {
		super();
		this.task_Id = task_Id;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.isCompleted = isCompleted;
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCompleted ? 1231 : 1237);
		result = prime * result + ((taskDate == null) ? 0 : taskDate.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
		result = prime * result + ((task_Id == null) ? 0 : task_Id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean isCompleted=false;
		
		
		
		
		
		
	}

	
	
	
	
	
	
}
