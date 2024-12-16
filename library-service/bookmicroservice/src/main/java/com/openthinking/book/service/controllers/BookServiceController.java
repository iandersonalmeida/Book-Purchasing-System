package com.openthinking.book.service.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openthinking.book.service.models.Book;
//import com.openthinking.book.service.services.BookService;

@RestController
@RequestMapping(value = "/api/almeidalibrary/")
public class BookServiceController {
	
	//@Autowired
	//private BookService bookService;
	
	@RequestMapping(value="/{bookId}",method=RequestMethod.GET)
	public Book getAllExistingBooks(@PathVariable("bookId") int bookId) {
		
		return new Book()
				.withId(bookId)
				.withAuthor("Zygmunt Bauman")
				.withTitle("Liquid Modernity"); 
		
		//return bookService.getBook(bookId);
	}
	
}
