package com.nielsen.convensiondemo.manager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.nielsen.convensiondemo.exception.BookNotFoundException;
import com.nielsen.convensiondemo.manager.impl.BookManagerImpl;
import com.nielsen.convensiondemo.model.Book;
import com.nielsen.convensiondemo.repository.BookRepository;

@RunWith(MockitoJUnitRunner.class)
public class BookManagerTest {
	
	@Mock
	private BookRepository bookRepository;
	
	private BookManager bookManager;
	
	@Before
	public void setUp() {
		bookManager = new BookManagerImpl(bookRepository);
	}
	
	@Test
	public void get() {
		Book book = new Book();
		book.setId(1L);
		book.setAuthor("Alain");
		book.setEditorial("Nielsen");
		
		given(bookRepository.findOne(1L)).willReturn(book);
		
		Book expectedResult = book;
		Book actualResult = bookManager.get(1L);
		
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test(expected = BookNotFoundException.class)
	public void getBookNotFound() {
		given(bookRepository.findOne(1L)).willReturn(null);
		bookManager.get(1L);
	}
	
	@Ignore
	@Test
	public void save() {
		
	}
	
	@Ignore
	@Test
	public void list() {
		
	}
}
