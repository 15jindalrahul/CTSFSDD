package test;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Todo {

	private String todoId;
	private Task task;
	private RandomFortuneService fortService;
	private LocalDate date;
	private boolean iscompleted;
	
	public Todo(Task task,RandomFortuneService fortService)
	{
		this.task=task;
		this.fortService=fortService;
	}

	public void createTodo(String createdBy, String taskTime, boolean iscompleted) {

		System.out.println("creating task");
		task = new Task();
		fortService=new RandomFortuneService();
        System.out.println(fortService.fortunedetails());
		task.createTask(createdBy, taskTime);
		System.out.println("task created");

		setTodoId(UUID.randomUUID().toString());
		setDate(LocalDate.now());
		setIscompleted(iscompleted);

	}

	public String gettododetails() {

		return "task:" + task.gettaskdetails() + "todoId:" + getTodoId() + "date:" + getDate() + "iscompleted:"
				+ iscompleted;

	}

}
