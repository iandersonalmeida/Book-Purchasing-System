package com.openthinking.book.service.application;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import com.openthinking.book.service.controllers.BookServiceController;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookServiceApplicationTests {
	
	@Autowired
	private BookServiceController bookServiceController;

	@Test
	void contextLoads() throws Exception {
		assertThat(bookServiceController).isNotNull();
	}

}
