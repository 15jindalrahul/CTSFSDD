package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ToDoDao;
import com.example.demo.model.ToDo;
@Service
public class ToDoServiceImpl  implements ToDoService{

	ToDoDao toDoDao=null;
	
	
	@Autowired
	public ToDoServiceImpl(ToDoDao toDoDao) {
		super();
		this.toDoDao = toDoDao;
	}



	@Override
	public List<ToDo> getAllToDo() {
		
		return toDoDao.getAllToDo();
	}

}
