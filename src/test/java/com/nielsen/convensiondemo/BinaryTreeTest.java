package com.nielsen.convensiondemo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import org.junit.Before;
import org.junit.Test;

import com.nielsen.convensiondemo.model.BinaryTree;
import com.nielsen.convensiondemo.model.BinaryTreeImpl;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BinaryTreeTest {
	
	private BinaryTree binaryTree;
	private BinaryTreeImpl binaryTreeImpl;
	
	public void setUpData() {
		binaryTreeImpl = new BinarySearchTreeImpl(2);
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
	public void lookup() {
		try {
			int actualResult = binaryTree.lookup(3);
			int expectedResult = 3;
			
			assertThat(actualResult, is(equalTo(expectedResult)));
		}
		catch(BinaryTreeElementNotFoundException e) {
			fail();
		}		
	}
	
	@Test(expected = BinaryTreeElementNotFoundException.class)
	public void lookupElementNotFound() throws BinaryTreeElementNotFoundException {
		binaryTree.lookup(4);
	}
	
	@Test
	public void testUncheckedException() {
		BinaryTree binaryTree = Math.random() < 0.5 ? new BinarySearchTreeImpl() : null;
		binaryTree.add(3);
	
	}
	
	@Test
	public void testUncheckedIndexOutBound() {
		int[] array = new int[2];
		array[0] = 3;
		array[1] = 5;
		
		/*for(int i=0; i<=array.length; i++) {
			System.out.println(array[i]);
		}*/
	}
	
	@Test
	public void testCatchMultipleExceptions()  {
		try {
			Integer[] array = new Integer[3];
			System.out.println(array[3].intValue());
		}
		catch(ArrayIndexOutOfBoundsException|NullPointerException exception) {
			if(exception instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Exception Out of bound ");
			}
			else {
				System.out.println("Exception null pointer");
			}
			
		}
	}
	
	
	@Test
	public void resourceException() throws IOException {
		try (FileReader fileReader =  new FileReader("path/to/file/myfile.ext"); 
				BufferedReader bufferedReader = null) {
			
		}
		catch(IOException exception) {
			
		}
		finally {
			
		}
		/*catch(MyBuisinessException exp) {
			logging.informationError(exp.getMessage());
		}*/
	}
	
}
