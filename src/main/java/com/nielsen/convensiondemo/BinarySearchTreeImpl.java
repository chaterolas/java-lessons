package com.nielsen.convensiondemo;

import java.util.List;

public class BinarySearchTreeImpl extends BinaryTreeImpl implements BinarySearchTree {
	
	

	public BinarySearchTreeImpl() {
		
	}
	
	public BinarySearchTreeImpl(int element) {
		super(element);
	}
	
	private int lookupAux(BinaryTreeNode node, int element) throws BinaryTreeElementNotFoundException {
		if(node == null) {
			throw new BinaryTreeElementNotFoundException("The element " +  element + " is not in range");
		}
		
		if(element == node.getElement()) {
			return element;
		}
		else if(element < node.getElement()) {
			return lookupAux(node.getLeftChild(), element);
		}
		else {
			return lookupAux(node.getRightChild(), element);
		}
	}
	
	@Override
	public int lookup(int element) throws BinaryTreeElementNotFoundException {
		System.out.println("Binary search tree impl");
		return lookupAux(this.getRoot(), element);
	}
	
	
	public List lookup() {
		return null;
	}
	

	@Override
	public boolean isValid() {
		return isValidNode(this.root, null, null);
	}
	
	private boolean isValidNode(BinaryTreeNode node, Integer minValue, Integer maxValue) {
		if(node == null) {
			return true;
		}
		else {
			if(maxValue!=null && node.getElement() > maxValue) {
				return false;
			}
			if(minValue!=null && node.getElement() < minValue) {
				return false;
			}
			
			return isValidNode(node.getLeftChild(), minValue, node.getElement()) && 
					isValidNode(node.getRightChild(), node.getElement(), maxValue);
		}
	}

	@Override
	public boolean isValid(boolean canBeEmpty) {
		return this.root == null ? canBeEmpty : isValidNode(this.root, null, null);
	}
	
	
}
