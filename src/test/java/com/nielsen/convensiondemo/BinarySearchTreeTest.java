package com.nielsen.convensiondemo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree binarySearchTree;
	BinaryTree binaryTree;
	BinarySearchTreeImpl binarySearchTreeImpl;
	
	@Before
	public void setUp() {
		this.binarySearchTreeImpl = new BinarySearchTreeImpl(100);
		this.binarySearchTree = binarySearchTreeImpl;
		this.binaryTree = binarySearchTreeImpl;
	}
	
	@Test
	public void isValidSingleNode() {
		boolean actualResult = binarySearchTree.isValid();
		boolean expectedResult = true;
		
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void isValidMultipleNodes() {
		binarySearchTreeImpl.getRoot().setLeftChild(binarySearchTreeImpl.new BinaryTreeNode(4));
		binarySearchTreeImpl.getRoot().setRightChild(binarySearchTreeImpl.new BinaryTreeNode(103));
		
		boolean actualResult = binarySearchTree.isValid();
		boolean expectedResult = true;
		
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test 
	public void isNotValidMultipleNode() {
		binarySearchTreeImpl.getRoot().setLeftChild(binarySearchTreeImpl.new BinaryTreeNode(4));
		binarySearchTreeImpl.getRoot().setRightChild(binarySearchTreeImpl.new BinaryTreeNode(103));
		
		binarySearchTreeImpl.getRoot().getLeftChild().setRightChild(binarySearchTreeImpl.new BinaryTreeNode(105));
		
		boolean actualResult = binarySearchTree.isValid();
		boolean expectedResult = false;
		
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void polimorfism() {
		int myInteger = 2 + 1;
		double number = 1.0 + 2;
	}
	
}
