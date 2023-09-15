package com.openthinking.book.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openthinking.book.service.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	public Book getBookById(int id);

}
