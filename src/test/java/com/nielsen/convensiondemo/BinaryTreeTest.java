package com.nielsen.convensiondemo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BinaryTreeTest {
	
	private BinaryTree binaryTree;
	private BinaryTreeImpl binaryTreeImpl;
	
	public void setUpData() {
		binaryTreeImpl = new BinarySearchTree(2);
		BinaryTreeImpl.BinaryTreeNode leftChild = binaryTreeImpl.new BinaryTreeNode(1);
		BinaryTreeImpl.BinaryTreeNode rightChild = binaryTreeImpl.new BinaryTreeNode(3);
		binaryTreeImpl.getRoot().setLeftChild(leftChild);
		binaryTreeImpl.getRoot().setRightChild(rightChild);
	}
	
	@Before
	public void setUp() {
		setUpData();
		binaryTree = binaryTreeImpl;
	}
	
	@Test
	public void lookup() throws BinaryTreeElementNotFoundException {
		// TODO: Data Setup to be used in the test case
		
		// TODO: Call the method to be tested
		int actualResult = binaryTree.lookup(3);
		int expectedResult = 3;
		
		// TODO: Make an assertion to verify the expected functionality
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test(expected = BinaryTreeElementNotFoundException.class)
	public void lookupElementNotFound() throws BinaryTreeElementNotFoundException {
		binaryTree.lookup(4);
	}
}
