package com.BinaryTree;

import org.junit.Assert;

public class MyBinaryTreeTest {
	
	
	 public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		 MyBinaryTree<Integer>myBinaryTree = new MyBinaryTree<>();
		 myBinaryTree.add(56);
		 myBinaryTree.add(30);
		 myBinaryTree.add(70);
		 int size = myBinaryTree.getSize();
		 Assert.assertEquals(3, size);
	 }

}
