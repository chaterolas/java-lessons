package com.nielsen.convensiondemo.manager;

import java.util.List;

import com.nielsen.convensiondemo.model.Book;

public interface BookManager {
	List<Book> list();
	Book get(Long bookId);
	String save(Book book);
}
