package com.mycompany.very_24_01_20_test;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Comment {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private  Integer commentId;
    private LocalDate cDate; 
	
    
    
    
    
}
