package com.mycompany_one_to_one_unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity

public class Task {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="TaskName")
	private  String taskName;
	
	
	
	
		public Task(String taskName) {
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
