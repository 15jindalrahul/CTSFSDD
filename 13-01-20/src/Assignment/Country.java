package Assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import lombok.AllArgsConstructor; 
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Country {
	
	 private String name;
	List<State> stateList=null;
	{
		stateList=new ArrayList<State>();
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<State> getStateList() {
		return stateList;
	}



	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}



	public Country(String cname) {
		super();
		this.name = name;
		
	
	}
	
	
	public List<State> addState(String statename)
	{
		
	}
	 public int  getStatList()
	
	 {
		Collections.sort(stateList);
		return stateList;
	 }
	
	
	
	
	
	
	

}
