package com.nielsen.convensiondemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nielsen.convensiondemo.BinaryTreeElementNotFoundException;

public class BinaryTreeImpl implements BinaryTree {
	
	public class BinaryTreeNode {
		private int element;
		@JsonIgnore
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + element;
			result = prime * result + ((leftChild == null) ? 0 : leftChild.hashCode());
			result = prime * result + ((parent == null) ? 0 : parent.hashCode());
			result = prime * result + ((rightChild == null) ? 0 : rightChild.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BinaryTreeNode other = (BinaryTreeNode) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (element != other.element)
				return false;
			if (leftChild == null) {
				if (other.leftChild != null)
					return false;
			} else if (!leftChild.equals(other.leftChild))
				return false;
			if (parent == null) {
				if (other.parent != null)
					return false;
			} else if (!parent.equals(other.parent))
				return false;
			if (rightChild == null) {
				if (other.rightChild != null)
					return false;
			} else if (!rightChild.equals(other.rightChild))
				return false;
			return true;
		}

		private BinaryTreeImpl getOuterType() {
			return BinaryTreeImpl.this;
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
		System.out.println("Binary tree impl");
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
