package ian.projects.backendside.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ian.projects.backendside.domain.Book;
import ian.projects.backendside.service.BookServiceService;

@RestController
@RequestMapping(value = "/bookservice/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class BookServiceController {
	
	private static final Logger log = LoggerFactory.getLogger(BookServiceController.class);
	
	@Autowired
	private BookServiceService bookService;
	
	@GetMapping("/books/{author}")
	public List<Book> getBooksBasedOnAuthor(@PathVariable String author) {
		
		 log.info("author: "+author);
		
		return bookService.getBooksByAuthor(author);				
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	

}

