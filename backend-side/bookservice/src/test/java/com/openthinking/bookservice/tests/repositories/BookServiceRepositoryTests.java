package com.openthinking.bookservice.tests.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.openthinking.bookservice.domain.Book;
import com.openthinking.bookservice.repository.BookServiceRepository;

import jakarta.persistence.EntityManagerFactory;
@RunWith(SpringRunner.class)
//@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BookServiceRepositoryTests {
	
	private static final Logger log = LoggerFactory.getLogger(BookServiceRepositoryTests.class);
	
	@MockBean
	private BookServiceRepository bookServiceRepository;
	
	
	//comments--------------------------------------------------------------------------------------
	/*
	@MockBean
	private TestEntityManager testEntityManager; 	
	
	//@MockBean
	//private EntityManagerFactory entityManagerFactory; 
	 * 
	 @MockBean
	 private DataSource dataSource;
	
	 * 
	 * */
	
	
	
	//comments---------------------------------------------------------------------------------------
	
	

	@Test
	public void testIfFindAllTheBooks() throws Exception {
		
		List<Book> books = bookServiceRepository.findAll();			
		log.info("Assertion:"+ assertThat(books).isEqualTo(2).toString());		
	}	
	
}
