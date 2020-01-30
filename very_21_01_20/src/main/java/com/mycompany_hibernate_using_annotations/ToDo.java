package com.mycompany_hibernate_using_annotations;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class ToDo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int toDoId;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String uId;
    @Column(name="toDoName")
    private String toDoName;
    
    private LocalDate creationLocalDate;
    
    
    
}
