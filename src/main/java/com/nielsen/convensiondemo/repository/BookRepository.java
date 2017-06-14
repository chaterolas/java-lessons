package com.nielsen.convensiondemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nielsen.convensiondemo.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
	
	@Query("SELECT * FROM Book book WHERE book.author=?1")
	Book findOneByAuthor(String author);
	
}
