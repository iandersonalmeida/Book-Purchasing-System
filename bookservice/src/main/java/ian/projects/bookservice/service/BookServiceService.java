package ian.projects.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ian.projects.bookservice.domain.Book;
import ian.projects.bookservice.repository.BookServiceRepository;

@Service
public class BookServiceService {
	
	@Autowired
	private BookServiceRepository bookServiceRepository;
	
	public List<Book> getBooksByAuthor(String author) {
		
		return bookServiceRepository.findByAuthor(author);		
	}
	
	public List<Book> getAllBooks(){
		return bookServiceRepository.findAllBooks();
	}

}
