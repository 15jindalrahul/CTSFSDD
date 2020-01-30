package com.mycompany_mapping_bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity

public class Task1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "TaskName")
	private String taskName;
	
	// this is important in bi directinal
	
	@OneToOne(mappedBy="task",cascade=CascadeType.ALL) 
	private ToDo1 todo;
	
	
	
	
	
	
	

	public Task1(String taskName) {
		super();
		this.taskName = taskName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}