package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;
@Repository
@Transactional
public interface BookDao extends JpaRepository< Book, Integer  >{
// to add:   extends JpaRepository< Book, Integer  >  it is mandatory
	

	

}
