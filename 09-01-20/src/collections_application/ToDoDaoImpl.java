package collections_application;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class ToDoDaoImpl implements ToDoDao {
	private List<Todo> toDoList;
	private Todo td ;
	{
   toDoList =new ArrayList<Todo>();
	}
	@Override
	public Todo createtoDo(String toDoName) {
     String[] str=(UUID.randomUUID().toString()).split("-");
     td=new Todo((str[0]+str[1]).isLowerCase(),String Name);
    	toDoList=td;	 
    		 
		return td;
	}

	@Override
	public List<Todo> getAllToDos() {
		
		
		

		return null;
	}

	@Override
	public Todo findById(String toDoId) {

		return null;
	}

	@Override
	public void deleteById(String toDoId) {

	}

	@Override
	public void updateById(String toDoId) {

	}

}
