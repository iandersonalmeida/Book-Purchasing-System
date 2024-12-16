package com.openthinking.bookservice.tests.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.openthinking.bookservice.controller.BookServiceController;
import com.openthinking.bookservice.repository.BookServiceRepository;
import com.openthinking.bookservice.service.BookService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class BookServiceControllerTest {
	
	@MockBean
	private BookServiceController bookServiceController;
	

	
	@MockBean
	private MockMvc mockMvc;
	
	
/*	@Test
	public void testIfIsNotNull() throws Exception {
		
		assertThat(bookServiceRepository).isNotNull();			
	} */
	
		
	@Test
	public void testGetBooksBasedOnSearchString() throws Exception {
		this.mockMvc.perform(get("/bookservice/api/v1/books/{searchstring}", "Hannah")).andExpect(status().isOk());
	} 	

}
