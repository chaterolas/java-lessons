package com.nielsen.convensiondemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	@JsonProperty("author_name")
	private String author;
	@JsonProperty("editorial_name")
	private String editorial;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", editorial=" + editorial + "]";
	}
	
	
}
