package com.nielsen.convensiondemo;

public class BinaryTreeImpl implements BinaryTree {

	private static final int MAXIMAL_HEIGHT = 20;
	
	protected int element;
	protected BinaryTreeImpl parent;
	protected BinaryTreeImpl leftChild;
	protected BinaryTreeImpl rightChild;
	
	public BinaryTreeImpl() {
	
	}
	
	public BinaryTreeImpl(int element) {
		this.element = element;
	}
	
	@Override
	public void add(int element) {
		
		
	}

	@Override
	public void remove(int element) {
		
		
	}

	@Override
	public int lookup(int element) throws BinaryTreeElementNotFoundException {
		if(element == this.element) {
			return element;
		}
		else {
			try {
				if(leftChild != null) {
					return leftChild.lookup(element);
				}
			}
			catch(BinaryTreeElementNotFoundException exception) {
				if(rightChild != null) {
					return rightChild.lookup(element);
				}
			}
		}
		
		throw new BinaryTreeElementNotFoundException();
	}

	@Override
	public boolean lookup(int minimum, int maximum) {
		
		return false;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public BinaryTreeImpl getParent() {
		return parent;
	}

	public void setParent(BinaryTreeImpl parent) {
		this.parent = parent;
	}

	public BinaryTreeImpl getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeImpl leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeImpl getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeImpl rightChild) {
		this.rightChild = rightChild;
	}

	
}
