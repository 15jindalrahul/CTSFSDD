package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("/todos")// here to remmeber syntax ,always put s after name taken in request mapping
public class ToDoRestController {

	
	private ToDoService toDoService;
	
    public ToDoRestController() {
		super();
	}


	@Autowired
	public ToDoRestController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}
	                                                   // THESE ARE IN BUILT METHODS WHICH WE CAN USE INSTEAD OF GETMapping("/")
	
	
	                                                  //post          create a new entity
	                                                  //get           Read a list of entitties or single entity
	                                                  //Put           update an existing entity
	@GetMapping("/")                                 //delete         delete an existing entity
	public List<ToDo> getAllTodo()                             
	
	{
		return toDoService.getAllToDo();
	}
	
	
}
