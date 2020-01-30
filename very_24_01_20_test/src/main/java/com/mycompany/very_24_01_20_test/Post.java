package com.mycompany.very_24_01_20_test;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;



public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;

	private String postBy;
	
	private String url;

	private LocalDate createDate;
	
	@OneToMany(mappedBy = "post",cascade = {CascadeType.ALL})
	@JoinColumn(name = "comment_id")
	private Comment comment;

	public Post(int postId,String postBy, String url, LocalDate createDate) {
		super();
		
		this.postBy = postBy;
		this.url = url;
		this.createDate = createDate;
		
	}
	
	
}


