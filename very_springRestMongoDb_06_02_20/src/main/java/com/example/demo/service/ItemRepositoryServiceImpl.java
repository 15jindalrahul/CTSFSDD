package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.ItemRepository;
import com.example.demo.model.Item;
@Service
@EnableTransactionManagement
public class ItemRepositoryServiceImpl implements ItemRepositoryService {
	
	
@Autowired
  private ItemRepository itemRepository;
	@Override
	public Item createItem(Item item) {
		
		return itemRepository.save(item);
	}

	
	@Override
	public List<Item> getAllItem() {
		
		return itemRepository.findAll();
	}


	@Override
	public Optional<Item> getItemById(String itemId) {
		
		return itemRepository.findById(itemId);
	}


	@Override
	public void deleteAll(Item item) {
		
		
	}


	@Override
	public void deleteById(String itemId) {
		
		
	}


	@Override
	public List<Item> findByitemName(String itemName) {
	
		return itemRepository.findByitemName(itemName);
	}


	@Override
	public List<Item> findByitemNameAndPrice(String itemName, Double price) {
		
		return itemRepository.findByitemNameAndPrice(itemName, price);
	}
	
	
	
	
}
	
