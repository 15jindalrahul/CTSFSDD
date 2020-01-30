package JDBC;

import java.util.ArrayList;
import java.util.List;

public interface PersonDao {
	List<Person> lt=new ArrayList<Person>();
	
	
	public List <Person> getDetails() throws Exception;

}
