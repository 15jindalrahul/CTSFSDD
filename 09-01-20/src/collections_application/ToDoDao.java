package collections_application;
import java.util.List;

public interface ToDoDao {
	// abstract methods in interface
	// no need to write keyword abstract in methods ,it is taken by default
	
	
	
	
	public Todo createtoDo(String toDoName);
	public List<Todo>getAllToDos();
    public Todo findById(String toDoId);
    public void deleteById(String toDoId);
    public void updateById(String toDoId);
}
