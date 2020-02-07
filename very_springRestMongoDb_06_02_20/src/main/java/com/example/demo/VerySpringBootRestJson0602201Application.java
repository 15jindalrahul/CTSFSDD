package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ItemRepository;

import com.example.demo.model.Item;

@SpringBootApplication
public class VerySpringBootRestJson0602201Application implements CommandLineRunner{
       private ItemRepository itemRepository;
       
       
      
     @Autowired  
	public VerySpringBootRestJson0602201Application(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}
     

	public static void main(String[] args) {
		SpringApplication.run(VerySpringBootRestJson0602201Application.class, args);
	}

    @Override
	public void run(String... args) throws Exception {
		itemRepository.save(new Item("ABC",11.0));
		itemRepository.save(new Item("java",1.0));
		itemRepository.save(new Item("oracle",5.6));
		
	
    }

}