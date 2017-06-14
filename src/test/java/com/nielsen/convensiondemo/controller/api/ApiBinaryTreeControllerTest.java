package com.nielsen.convensiondemo.controller.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nielsen.convensiondemo.exception.BookNotFoundException;
import com.nielsen.convensiondemo.manager.BookManager;
import com.nielsen.convensiondemo.model.Book;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.doNothing;
import static org.mockito.BDDMockito.eq;

@RunWith(SpringRunner.class)
@WebMvcTest(ApiBinaryTreeController.class)
public class ApiBinaryTreeControllerTest {

	@MockBean
	private BookManager bookManager;
	
	@Autowired
	private MockMvc mockMvc;
	
	private MediaType contentType;
	
	@Before
	public void setUp() {
		contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
                MediaType.APPLICATION_JSON.getSubtype(),
                Charset.forName("utf8"));
	}
	
	@Test
	public void getBook() throws Exception {
		String url = "/binary-tree/get-book/1";
		
		given(bookManager.get(1L)).willReturn(new Book());
		
		mockMvc.perform(get(url))
			.andExpect(status().isOk())
			.andExpect(content().contentType(contentType));
	}
	
	@Test
	public void getBookNotFound() throws Exception {
		String url = "/binary-tree/get-book/1";
		
		given(bookManager.get(1L)).willThrow(new BookNotFoundException("1"));
		
		mockMvc.perform(get(url))
			.andExpect(status().isNotFound());
	}
	
	@Test
	public void convertBook() throws Exception {
		String url = "/binary-tree/convert-book";
		
		Book book = new Book();
		book.setAuthor("Alain");
		book.setEditorial("Nielsen");
		
		given(bookManager.save(eq(book))).willReturn("");
		
		String requestBody = new ObjectMapper().writeValueAsString(book);
		mockMvc.perform(post(url).contentType(contentType).content(requestBody))
			.andExpect(status().isOk());
	}
}
