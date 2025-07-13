package com.vibol.Datastructure.tree.excercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTreeLoop {

	Node root;

	public Node insert(Node node, int value) {
		if (node == null) {
			return new Node(value);
		}
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public void insertUsingLoop(int value) {
		Node newNode = new Node(value);

		// check if Tree is empty
		if (root == null) {
			root = newNode;
			return;
		}

		// Find parent node to add child

		Node currentNode = root;
		Node parentNode = null;

		while (currentNode != null) {
			parentNode = currentNode;
			if (value < currentNode.data) {
				currentNode = currentNode.left;
			} else if (value > currentNode.data) {
				currentNode = currentNode.right;
			} else {
				return; // Duplicate value not allowed (currentNode.data = value they input)
			}
		}

		// Link newNode to the appropriate side of parent

		if (value < parentNode.data) {
			parentNode.left = newNode;
		} else {
			parentNode.right = newNode;
		}

	}

	// function print node
	public void inorder(Node node) {
		if (node != null) {
			// left , root, right : in order print
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}
	
	//Search 	
	public boolean search(int target) {
		 Node current = root;
		 while(current != null) {
			 if(target == current.data) {
				 return true;
			 }else if(target < current.data) {
				 current = current.left;
			 }else {
				 current = current.right;
			 }
		 }
		
		return false; // No Found Target
	}
	
	// sum all node using recursive 	
	public int sum(Node node) {
		if(node == null) {
			return 0;
		}		
		return node.data + sum(node.left) + sum(node.right);
	}
	
	
	// sum using loop 	
	public int sumUsingLoop(Node root) {
		if(root == null) {
			return 0;
		}
		
		// using stack : First In Last Out 
		Stack<Node> stack = new Stack<>();
		
		// we push the root to the stack 		
		stack.push(root);
		int sum =0;
		
		while(!stack.empty()) {
			
			// we take the root to sum 
			Node current = stack.pop();
			sum+=current.data;
			
			// we take left or right to sum 
			
			if (current.right !=null) {
				//we add the remaining at right to the stack 
				stack.push(current.right);
			}
			if (current.left !=null) {
				// we add the remaining at left to the stack 
				stack.push(current.left);
			}			
		}		
		return sum;
	}
	
	// sum leaves with recursive 	
	public int sumOfLeaves(Node node) {
		if(node == null) {
			return 0;
		}
		if(node.left == null && node.right ==null) {
			return node.data;
		}
		
		return sumOfLeaves(node.left)+sumOfLeaves(node.right);
	}
	
	// sum leave with iterative BFS (level checking)
	public int sumUsingQueue(Node root) {
		//check if the node is empty 
		if(root == null) {
			return 0;
		}
		
		// Queue is Fist In Fist Out 
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int sum =0;
		
		// queue have value 
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.println("==>Queue loop item: " + current.data);
			// check and find leave the last value 
			if(current.left == null && current.right ==null) {
				sum +=current.data;
			}
			
			// check what we need to add to the queue 
			
			if(current.left !=null) {
				queue.add(current.left);
			}
			if(current.right != null) {
				queue.add(current.right);
			}
		}		
		return sum;
	}
	
	// sum suing DFS
	public int sumUsingStack(Node root) {
		if(root == null) {
			return 0;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		int sum =0;
		
		while(!stack.empty()) {
			Node current = stack.pop();
			System.out.println("==>Stack loop item: " + current.data);
			//check if it is a leaf
			if(current.left == null && current.right ==null) {
				sum +=current.data;
			}
			if(current.right !=null) {
				stack.push(current.right);
			}
			if(current.left !=null) {
				stack.push(current.left);
			}
		}		
		return sum;
	}
	
	// Sum in Rang 	
	public int sumInRang(Node node, int l, int r) {
		if(node == null) {
			return 0;
		}
		if(node.data < l) {
			return sumInRang(node.right, l, r);
		}
		if(node.data > r) {
			return sumInRang(node.left, l, r);
		}		
		return node.data + sumInRang(node.left, l, r)+sumInRang(node.right, l, r);
	}
	
}
