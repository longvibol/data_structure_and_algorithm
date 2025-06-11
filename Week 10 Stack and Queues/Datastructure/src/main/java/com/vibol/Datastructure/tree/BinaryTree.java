package com.vibol.Datastructure.tree;

public class BinaryTree {
	
	Node root;
	
	//In order Traversal  
	void inorder(Node node) {
		if(node == null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.data + " "); // we want to print from left first then to right 
		inorder(node.right);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(20);
		tree.root.left.left = new Node(3);
		
		tree.inorder(tree.root); // Output: 3 5 10 20
	}

}
