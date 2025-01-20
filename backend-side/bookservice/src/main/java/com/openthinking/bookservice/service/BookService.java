package com.openthinking.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinking.bookservice.domain.Book;
import com.openthinking.bookservice.repository.BookServiceRepository;

@Service
public class BookService {
	
	@Autowired
	private BookServiceRepository bookServiceRepository;
	
	public List<Book> getBooksByAuthor(String author) {
		
		return bookServiceRepository.findByAuthor(author);		
	}
	
	public List<Book> getAllBooks(){
		return bookServiceRepository.findAllBooks();
	}

}
