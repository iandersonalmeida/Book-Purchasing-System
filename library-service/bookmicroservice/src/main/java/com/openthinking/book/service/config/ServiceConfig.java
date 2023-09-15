package com.openthinking.book.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	
	@Value("${spring.datasource.url}")
	private String exampleProperty;
	
	public String getExampleProperty() {
		return exampleProperty;
	}

}
