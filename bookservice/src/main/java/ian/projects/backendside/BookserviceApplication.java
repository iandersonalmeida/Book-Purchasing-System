
package ian.projects.backendside;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ian.projects.backendside.domain.Book;
import ian.projects.backendside.repository.BookServiceRepository;
@SpringBootApplication
public class BookserviceApplication {
	

	private static final Logger log = LoggerFactory.getLogger(BookserviceApplication.class);
	

	

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}

    @Bean
    CommandLineRunner show(BookServiceRepository bookServiceRepository) {
		return (args) ->{
			
			log.info("Books found with findAllBooks()");
			log.info("-------------------------------");
			List<Book> books = bookServiceRepository.findAllBooks();
			//bookServiceRepository.findAllBooks().forEach(book -> {
				log.info("Books returned: "+books.toString());
				log.info("");
			};
		}; 
		

}
