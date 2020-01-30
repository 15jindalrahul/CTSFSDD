package com.mycompany_mapping_one_to_many;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class ToDo2 {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;


private int toDo2Id;

private String toDoName;



@OneToMany(mappedBy="todo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})

private List<MTask> mTask;


public ToDo2( int toDo2Id, String toDoName, List<MTask> mTask) {
	super();
	
	this.toDo2Id = toDo2Id;
	this.toDoName = toDoName;
	this.mTask = mTask;
} 







}
