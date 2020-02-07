package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Book;

public interface BookService {
	
	
	public List<Book> getAllBook();
	public Optional<Book> getBookById(Integer bookId);
	public Book createBook(Book book);
    public void deleteById(Integer bookId);
    public void deleteAll(Book book);
     
     public List<Book> findByBookName(String bookName);
     public List<Book> findByAuthor(String author);
	 public List<Book> findByAuthorAndBookName(String author,String bookName);
}
