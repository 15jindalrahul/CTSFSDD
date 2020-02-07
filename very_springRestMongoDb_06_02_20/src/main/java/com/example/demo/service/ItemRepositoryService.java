package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Item;

public interface ItemRepositoryService {

	public Item createItem(Item item);//1
	public List<Item> getAllItem();//2
	// both 1 and 2 methods to write together always
	
	
	public Optional<Item> getItemById(String itemId);
	
	public void deleteAll(Item item);
	public void deleteById(String itemId);
	public List<Item> findByitemName(String itemName);
	public List<Item> findByitemNameAndPrice(String itemName,Double price); 

	
	
}
