package com.nielsen.convensiondemo;

public class BinaryTreeImpl implements BinaryTree {
	
	public class BinaryTreeNode {
		private int element;
		private BinaryTreeNode parent;
		private BinaryTreeNode leftChild;
		private BinaryTreeNode rightChild;
		
		public BinaryTreeNode() {
			
		}
		
		public BinaryTreeNode(int element) {
			this.element = element;
		}
		
		private int lookupAux(int element) throws BinaryTreeElementNotFoundException {
			if(element == this.element) {
				return element;
			}
			else {
				try {
					if(leftChild != null) {
						return leftChild.lookupAux(element);
					}
				}
				catch(BinaryTreeElementNotFoundException exception) {
					if(rightChild != null) {
						return rightChild.lookupAux(element);
					}
				}
			}
			
			throw new BinaryTreeElementNotFoundException();
		}

		public int getElement() {
			return element;
		}

		public void setElement(int element) {
			this.element = element;
		}

		public BinaryTreeNode getParent() {
			return parent;
		}

		public void setParent(BinaryTreeNode parent) {
			this.parent = parent;
		}

		public BinaryTreeNode getLeftChild() {
			return leftChild;
		}

		public void setLeftChild(BinaryTreeNode leftChild) {
			this.leftChild = leftChild;
		}

		public BinaryTreeNode getRightChild() {
			return rightChild;
		}

		public void setRightChild(BinaryTreeNode rightChild) {
			this.rightChild = rightChild;
		}

		@Override
		public String toString() {
			return "BinaryTreeNode [element=" + element + ", parent=" + parent + ", leftChild=" + leftChild
					+ ", rightChild=" + rightChild + "]";
		}
	}

	private static final int MAXIMAL_HEIGHT = 20;
	
	protected BinaryTreeNode root;
	
	public BinaryTreeImpl() {
	
	}
	
	public BinaryTreeImpl(int element) {
		this.root = this.new BinaryTreeNode(element);
	}
	
	@Override
	public void add(int element) {
		
		
	}

	@Override
	public void remove(int element) {
		
		
	}

	@Override
	public int lookup(int element) throws BinaryTreeElementNotFoundException {
		return root.lookupAux(element);
	}	

	@Override
	public boolean lookup(int minimum, int maximum) {
		return false;
	}

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	@Override
	public String toString() {
		return "BinaryTreeImpl [root=" + root + "]";
	}
}
