package com.nielsen.convensiondemo;

import org.junit.Before;
import org.junit.Test;

public class RedBlackTreeTest {

	
	BinaryTreeImpl binaryTreeImpl;
	RedBlackTree redBlackTree;
	
	@Before
	public void setUp() {
		redBlackTree = new RedBlackTree(1);
		binaryTreeImpl = redBlackTree;
	}
	
	
	@Test
	public void test() throws BinaryTreeElementNotFoundException {
		binaryTreeImpl.lookup(1);
	}
}
