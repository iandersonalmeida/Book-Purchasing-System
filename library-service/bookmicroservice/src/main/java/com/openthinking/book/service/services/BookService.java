package com.openthinking.book.service.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinking.book.service.config.ServiceConfig;
import com.openthinking.book.service.models.Book;
import com.openthinking.book.service.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	ServiceConfig config;
	
	 public Book getBook(int bookId) {
		 
		 Book book = bookRepository.getBookById(bookId);
		 return book.withTitle(config.getExampleProperty());				
	} 

}
