package com.vibol.Datastructure.tree;

public class BinarySearchTree {
	
	Node root;
	
	// Insert function 
	// We think first on the data type return we want Node and have two parameter Node and data input
	public Node insert(Node node,int value) {
		// first it the Node no value we return root with data we input 
		if(node == null) {
			return new Node(value);
		}
		
		// think we add to the left or right 
		if(value < node.data) { 
			node.left = insert(node.left, value);
		}else if(value>node.data) {
			node.right = insert(node.right, value);
		}		
		return node;
	}
	
	// Search Function 
	
	public boolean search(Node node, int data) {
		if(node == null) {
			return false;
		}
		if(node.data == data) {
			return true;
		}
		return data < node.data ? search(node.left, data) : search(node.right, data);
		
	}
	
	// function print node 
	public void inorder(Node node) {
		if(node !=null) {
			// left , root, right : in order print 
			inorder(node.left);  
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}
	
	// function delete node 
	public Node delete(Node node, int data) {
		if(node == null) {
			return null;
		}
		// find if the data we want to delete at left or right
		if(data <node.data) {
			node.left = delete(node.left, data);
		}else if(data > node.data) {
			node.right = delete(node.right, data);
		}else {
			// in this loop we fond the delete number 
			// we need to check if it is leaft, have one child or two child
			
			if(node.left ==null) {
				// if no data at left we take the right data to the root 
				// case have only one child at right 
				return node.right;
			}else if (node.right == null) {
				// case have only one child at left 
				return node.left;
			}
			
			// case have two childe (we need to find in order successor who at the right and biggest number will be to parent
			// Get in order successor (min in the right subtree) 
			Node successor = findMin(node.right);
			// we assing to the root 
			node.data = successor.data;
			//delete data that we found 
			node.right = delete(node.right, successor.data);
		}
		
		return node;
	}
	
	// extra function support delete method to find In order successor 
	
	public Node findMin(Node node) {
		// we need to find in the left side because it is Min number 
		while(node.left !=null) {
			node = node.left;
		}
		// we go to the left until we found the value 
		// after we found we return it 
		return node;
	}
	

}



















