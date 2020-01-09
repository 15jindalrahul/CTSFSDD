package test;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Task {

	private int taskId;
	private String taskTime;
	private String createdBy;
	
	public void createTask(String createdBy,String taskTime)
	{
		setTaskTime(taskTime);
		setCreatedBy(createdBy);
	}
	public String gettaskdetails()
	{
		return("taskId:"+ getTaskId()+"tasktime:"+ getTaskTime()+"createdby:"+ getCreatedBy());
	
	}

}
