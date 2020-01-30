package com.mycompany.jdbcmaven;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9120447908472833000L;
	
	
	private int food_Id;
	private String food_name;
	private double calorie;

}
