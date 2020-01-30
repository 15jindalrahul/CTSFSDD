package com.mycompany_one_to_one_unidirectional;
/*            here we will discuss about ONE  to ONE(UNI-DIRECTINAL)  sql mapping using hibernate*/

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="TD")
public class ToDo {

	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;


@Column(name ="TASKID")
private int taskId;

private String toDoName;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="task_Id")
private Task task;
public ToDo(int taskId, String toDoName) {
	super();
	this.taskId = taskId;
	this.toDoName = toDoName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getToDoName() {
	return toDoName;
}
public void setToDoName(String toDoName) {
	this.toDoName = toDoName;
}
public Task getTask() {
	return task;
}
public void setTask(Task task) {
	this.task = task;
}






	

}
