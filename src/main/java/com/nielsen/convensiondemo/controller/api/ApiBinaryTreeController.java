package com.nielsen.convensiondemo.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nielsen.convensiondemo.BinarySearchTreeImpl;
import com.nielsen.convensiondemo.manager.BookManager;
import com.nielsen.convensiondemo.model.BinaryTreeImpl;
import com.nielsen.convensiondemo.model.Book;

@RestController
@CrossOrigin
@RequestMapping(path = "/binary-tree")
public class ApiBinaryTreeController {
	
	/* @Autowired */
	private BookManager bookManager;
	//private List<BookManager> bookManagers;
	
	/*@Autowired
	public void setBookManager(BookManager bookManager) {
		this.bookManager = bookManager;
	}*/
	
	public ApiBinaryTreeController(BookManager bookManager) {
		this.bookManager = bookManager;
	}
	
	@RequestMapping(path = "/hello-world", method = RequestMethod.GET) 
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public BinaryTreeImpl get() {
		BinaryTreeImpl binaryTreeImpl = new BinarySearchTreeImpl(2);
		BinaryTreeImpl.BinaryTreeNode leftChild = binaryTreeImpl.new BinaryTreeNode(1);
		BinaryTreeImpl.BinaryTreeNode rightChild = binaryTreeImpl.new BinaryTreeNode(3);
		binaryTreeImpl.getRoot().setLeftChild(leftChild);
		binaryTreeImpl.getRoot().setRightChild(rightChild);
		
		return binaryTreeImpl;
	}
	
	@RequestMapping(path = "/convert-to-object", method = RequestMethod.POST)
	public String post(@RequestBody BinaryTreeImpl binaryTreeImpl) {
		return binaryTreeImpl.toString();
	}
	
	@RequestMapping(path = "/get-book/{bookId}", method = RequestMethod.GET)
	public Book getBook(@PathVariable Long bookId) {
		return bookManager.get(bookId);
	}

	@RequestMapping(path = "/convert-book", method = RequestMethod.POST)
	public String convertBook(@RequestBody Book book) {
		return bookManager.save(book);
	}
}

