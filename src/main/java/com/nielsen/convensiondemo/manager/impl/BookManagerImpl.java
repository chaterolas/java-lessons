package com.nielsen.convensiondemo.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nielsen.convensiondemo.manager.BookManager;
import com.nielsen.convensiondemo.model.Book;

@Service
public class BookManagerImpl implements BookManager {

	@Override
	public List<Book> list() {
		
		return null;
	}

	@Override
	public Book get(Integer bookId) {
		Book book = new Book();
		book.setAuthor("Alain");
		book.setEditorial("Nielsen");
		return book;
	}

	@Override
	public String save(Book book) {
		return book.toString();
	}
	
}
