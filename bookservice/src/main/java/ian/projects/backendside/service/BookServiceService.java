package ian.projects.backendside.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ian.projects.backendside.domain.Book;
import ian.projects.backendside.repository.BookServiceRepository;

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



