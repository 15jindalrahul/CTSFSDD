package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document // here in mongoDb we will use annotations @Document not @Entity
@ToString

//ToString(exclude={"dateOfBirth",firstName"})
public class Item {
	
	
	
	@Id// also here @Id is not from package javax.persistence,it is from annotation.Id
	private String itemId;
	private String itemName;
	private Double price;
	//@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-mm-yy")
	//final LocalDate localDate;
	
	
	
	
	
	public Item() {
		super();
	}


	public Item(String itemName, Double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}




	
	
	
	
	

}
