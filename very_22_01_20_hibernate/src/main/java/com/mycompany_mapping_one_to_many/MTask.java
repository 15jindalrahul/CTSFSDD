package com.mycompany_mapping_one_to_many;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MTask {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;



private String mTaskName;	



@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
private ToDo2 todo;




public MTask() {
	super();
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getmTaskName() {
	return mTaskName;
}




public void setmTaskName(String mTaskName) {
	this.mTaskName = mTaskName;
}




public ToDo2 getTodo() {
	return todo;
}




public void setTodo(ToDo2 todo) {
	this.todo = todo;
}







}
