package com.vibol.Datastructure.tree;

public class BSTApplication {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 70);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 60);
		tree.root = tree.insert(tree.root, 80);

		// Display all node in order
		
		tree.inorder(tree.root);
		int searchNo = 60;
		boolean search = tree.search(tree.root, searchNo);
		System.out.println();
		System.out.println("Number search: " + searchNo + " " + search);
		
		
		// called delete function 
		System.out.println("=================");
		System.out.println("Delete 50");
		tree.root = tree.delete(tree.root, 50);
		tree.inorder(tree.root);
	}
}
