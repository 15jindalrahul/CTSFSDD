package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
	
	public List<Item> findByitemName(String itemName);
	public List<Item> findByitemNameAndPrice(String itemName,Double price); 

}
