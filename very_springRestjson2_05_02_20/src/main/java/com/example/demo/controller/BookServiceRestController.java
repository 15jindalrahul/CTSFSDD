package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.xml.ws.spi.http.HttpContext;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SimpleSessionStatus;

import com.example.demo.entity.Book;
import com.example.demo.error.BookNotFoundException;
import com.example.demo.error.ErrorMessage;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookServiceRestController {


  BookService bookService;

public BookServiceRestController(BookService bookService) {
	super();
	this.bookService = bookService;
}

//       Here we are using user defined exception i.e handleError1(it is of type BookNotFoundException),
//       handleError2(it is of type generic).
//       purpose :if we will find anything other than described in main class i.e VerySpringBootRestJson040220Application.java
//       than it will handle our error   

  @ExceptionHandler
  public ResponseEntity<ErrorMessage>handleError1(BookNotFoundException bne) 
  {
	  
	  ErrorMessage errorMessage=new ErrorMessage();
	  errorMessage.setMessage(bne.getMessage());
	  errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
	  errorMessage.setErrorTime(System.currentTimeMillis());
	  
	  return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	  
  }
  
  
	
  @ExceptionHandler
  public ResponseEntity<ErrorMessage>handleError2(Exception e)
  {
	  
	  ErrorMessage errorMessage=new ErrorMessage();
	  errorMessage.setMessage(e.getMessage());
	  errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
	  errorMessage.setErrorTime(System.currentTimeMillis());
	  
	  return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
  }
  
  
	@GetMapping("/books")  
   public List<Book> getAllBook()
   {
	   return bookService.getAllBook();
   }
	
	
	
	@GetMapping("/books/{bookId}")
	public Optional<Book> getBooKById(@PathVariable Integer bookId)
	{
		Optional<Book> book=bookService.getBookById(bookId);
		if(!book.isPresent())
		{
			throw new BookNotFoundException("book not found with is" + bookId);
		}
		
		return book;
	}
	
	
	//            Here we are using post-Mapping method
	// THESE ARE IN BUILT METHODS WHICH WE CAN USE INSTEAD OF GETMapping("/")
	
	
    //post          create a new entity
    //get           Read a list of entities or single entity
    //Put           update an existing entity
   //delete         delete an existing entity
	
	
	@PostMapping("/books")
	public Book  createBook(@RequestBody Book book)
	{
		book.setBookId(0);
		return bookService.createBook(book);
		
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book)
	{
		
		return bookService.createBook(book);
	}
	
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBookById(@PathVariable Integer bookId)
	{
		
		bookService.deleteById(bookId);
	}
	
	
	@DeleteMapping("/books")
	public void deleteAll(@RequestBody Book book)
	{
		
		bookService.deleteAll(book);
	}
	
	@GetMapping("/books/findByAuthor/{author}")
	public List<Book> findByAuthor(@PathVariable String author)
	{
		return bookService.findByAuthor(author);
	}
	@GetMapping("/books/findByBookName/{bookName}")
	public List<Book> findByBookName(@PathVariable String bookName)
	{
		return bookService.findByBookName(bookName);
	}
	@GetMapping("/books/findByAuthorAndBookName/{author}/{bookName}")
	public List<Book> findByBookName(@PathVariable String author,@PathVariable String bookName)
	{
		return bookService.findByAuthorAndBookName(author, bookName);
	}
	
}
