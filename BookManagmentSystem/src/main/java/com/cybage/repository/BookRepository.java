package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyabge.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	
	

}
