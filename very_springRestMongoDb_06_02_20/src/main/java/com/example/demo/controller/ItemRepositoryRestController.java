package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Item;
import com.example.demo.service.ItemRepositoryService;

@RestController
@RequestMapping("/api")
public class ItemRepositoryRestController {
	
	
	 private ItemRepositoryService itemRepositoryService;
    @Autowired
	public ItemRepositoryRestController(ItemRepositoryService itemRepositoryService) {
		super();
		this.itemRepositoryService = itemRepositoryService;
	}
	
	
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item)
	{
		return itemRepositoryService.createItem(item);
	}
	
	@GetMapping("/items")
	public List<Item> getItem()
	{
		return itemRepositoryService.getAllItem();
	}
	
	
	
	
	@GetMapping("items/{itemId}")
	public Optional<Item> getItemById(@PathVariable String itemId)
	{
		
	  return itemRepositoryService.getItemById(itemId);
	}

	@PutMapping("/items")
	public Item update(Item item)
	{
		return itemRepositoryService.createItem(item);
	}
	
	@DeleteMapping("/items")
	public void deleteAll(Item item)
	{
		itemRepositoryService.deleteAll(item);
	}
	
	
	@DeleteMapping("items/{itemId}")
	public void deleteById(String itemId)
	{
		
		itemRepositoryService.deleteById(itemId);
	
	}
	
	
	@GetMapping("items/finfByItemName/{itemName}")
	public List<Item> findByitemName(String itemName)
	{
		 return itemRepositoryService.findByitemName(itemName);
	}
	
	
	@GetMapping("/items/findByitemNameAndPrice/{itemNameAndPrice}")
	public List<Item> findByitemNameAndPrice(String itemName,Double price) 
	{
		 return itemRepositoryService.findByitemNameAndPrice(itemName, price);
	}
	
	
	
}
