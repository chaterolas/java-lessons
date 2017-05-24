package com.nielsen.convensiondemo;

public class BinarySearchTree extends BinaryTreeImpl {

	public BinarySearchTree() {
		
	}
	
	public BinarySearchTree(int element) {
		super(element);
	}
	
	private int lookupAux(BinaryTreeNode node, int element) throws BinaryTreeElementNotFoundException {
		if(node == null) {
			throw new BinaryTreeElementNotFoundException();
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
		return lookupAux(this.getRoot(), element);
	}
}
