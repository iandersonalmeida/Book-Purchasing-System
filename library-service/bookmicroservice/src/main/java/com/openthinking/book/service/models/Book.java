package com.openthinking.book.service.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@Column(name = "book_id", nullable = false)
	private int id;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Book withId(int id) {
		this.setId(id);
		return this;
	}
	
	public Book withAuthor(String author) {
		this.setAuthor(author);
		return this;
	}
	
	public Book withTitle(String title) {
		this.setTitle(title);
		return this;
	}	

}
