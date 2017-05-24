package com.nielsen.convensiondemo;

public interface BinaryTree {
	void add(int element);
	void remove(int element);
	int lookup(int element) throws BinaryTreeElementNotFoundException;
	boolean lookup(int minimum, int maximum);
}
