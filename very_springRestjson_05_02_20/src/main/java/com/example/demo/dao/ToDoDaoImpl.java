package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ToDo;
@Repository
public class ToDoDaoImpl implements ToDoDao {
 
 private List<ToDo> lt;
{
	lt= new ArrayList<ToDo>();
	
	lt.add(new ToDo(1,"rahul"));
	lt.add(new ToDo(1,"ABC"));
}



	@Override
	public List<ToDo> getAllToDo() {
	
		return lt;
	}
}

