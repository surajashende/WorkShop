package com.cyabge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="price")
	private String price;
	
	


}
