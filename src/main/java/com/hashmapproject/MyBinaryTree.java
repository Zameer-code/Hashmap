package com.BinaryTree;

public class MyBinaryTree<K extends Comparable<K>> {
	
	 public BinaryTreeNode<K> root;
	 	
	 	/**
	 	 * UC1 creating and adding of Binary Search Tree 
	 	 * @param key
	 	 */
	    public void add(K key){
	        this.root = this.addRecursively(root, key);
	    }

	    public BinaryTreeNode<K> addRecursively(BinaryTreeNode<K> current, K key){
	        if (current == null){
	            return new BinaryTreeNode<>(key);
	        }
	        int result = key.compareTo(current.key);
	        if (result == 0){
	            return current;
	        }
	        if (result == -1){
	            current.left = addRecursively(current.left, key);
	        }else if (result == 1){
	            current.right = addRecursively(current.right, key);
	        }
	        return current;
	    }
	    
	    /**
	     * UC-2 Creating the binary tree and finding the size of the Element
	     * @param current
	     * @return
	     */
	    public int getSizeRecursively(BinaryTreeNode<K> current){
	        return current == null ? 0 : 1 + this.getSizeRecursively(current.left)+
	                                         this.getSizeRecursively(current.right);
	    }

	    public int getSize(){
	        return this.getSizeRecursively(root);
	    }
	    
	    /**
	     * UC-3 Searching of Element
	     * @param current
	     * @param key
	     * @return
	     */

	    public K nodeSearch(BinaryTreeNode<K> current, K key) {
	        if (current == null || current.key == key)
	            return key;
	        int result = key.compareTo(current.key);
	        if (result < 0)
	            return nodeSearch(current.left, key);
	        else
	            return nodeSearch(current.right, key);
	    }

		public void add(int key) {
			// TODO Auto-generated method stub
			

		
			
		}		

}
