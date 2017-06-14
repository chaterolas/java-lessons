package com.nielsen.convensiondemo.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nielsen.convensiondemo.exception.BookNotFoundException;
import com.nielsen.convensiondemo.manager.BookManager;
import com.nielsen.convensiondemo.model.Book;
import com.nielsen.convensiondemo.repository.BookRepository;

@Service
public class BookManagerImpl implements BookManager {

	private BookRepository bookRepository;
	
	public BookManagerImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public List<Book> list() {
		
		return null;
	}

	@Override
	public Book get(Long bookId) {
		Book book = bookRepository.findOne(bookId);
		
		if(book == null) {
			throw new BookNotFoundException(bookId.toString());
		}
		
		return book;
	}

	@Override
	public String save(Book book) {
		Book bookPersisted = bookRepository.save(book);
		
		if(bookPersisted == null) {
			// TODO: Throw and exception when the book was not
			// saved
			throw new RuntimeException();
		}
		
		return bookPersisted.toString();
	}
	
}
