package com.vibol.Datastructure.tree.excercise;

public class BSTExcerciseApplication {
	public static void main(String[] args) {
		BinarySearchTreeLoop tree = new BinarySearchTreeLoop();
		
		// insert element to tree using loop 
		int[] values = {50,30,70,20,40,60,80};
		for(int value: values) {
			tree.insertUsingLoop(value);
		}
		
		System.out.println("=================");
		tree.inorder(tree.root);
		
		
		System.out.println();
		System.out.println("Find Target: 50 = "+tree.search(50));
		System.out.println("Find Target: 55 = "+tree.search(55));
		
		
		System.out.println();		
		System.out.println("Sum all nodes = " + tree.sum(tree.root));
		System.out.println("Sum all node using loop: = " + tree.sumUsingLoop(tree.root));
		
		/*
		 {50,30,70,20,40,60,80}; 
		 	50
		   /  \
		 30    70
		/ \    /\
	  20  40  60 80 
	sum Leave = 20 + 40 + 60 + 80 = 200
		 * 
		 */

		System.out.println("Sum all leaves: "+tree.sumOfLeaves(tree.root));
		System.out.println("Sum all leaves using iterative BFS: "+tree.sumUsingQueue(tree.root));
		System.out.println("Sum all leaves using iterative DFS: "+tree.sumUsingStack(tree.root));
		
		System.out.println("Sum all node in rang [30,70]: "+tree.sumInRang(tree.root,30,70));
		
	}

}
