package ian.projects.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ian.projects.backend.domain.Book;

public interface BookServiceRepository extends JpaRepository<Book, Integer> {
	
	//@Query("select b from Book b where b.author = ?1")
		public List<Book> findByAuthor(String author);
		
		@Query("select b from Book b")
		public List<Book> findAllBooks();
}
