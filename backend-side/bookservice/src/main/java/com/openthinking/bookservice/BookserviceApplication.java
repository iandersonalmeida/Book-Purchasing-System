package com.openthinking.bookservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.openthinking.bookservice.domain.Book;
import com.openthinking.bookservice.repository.BookServiceRepository;

@SpringBootApplication
public class BookserviceApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookserviceApplication.class);
		
	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner show(BookServiceRepository bookServiceRepository) {
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



	
	