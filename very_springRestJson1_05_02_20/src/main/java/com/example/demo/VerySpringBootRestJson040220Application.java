package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@SpringBootApplication
public class VerySpringBootRestJson040220Application  implements CommandLineRunner{
	
	 private BookDao bookDao;
	
	
	
	
    @Autowired
	public VerySpringBootRestJson040220Application(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}





	public static void main(String[] args) {
		SpringApplication.run(VerySpringBootRestJson040220Application.class, args);
	}





	@Override
	public void run(String... args) throws Exception {
		
		bookDao.save(new Book("ABC","DEF"));
		bookDao.save(new Book("java","rahul"));
		bookDao.save(new Book("oracle","rahul jindal"));
		
		
	}

	
	
	
	
}
