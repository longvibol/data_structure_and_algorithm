package com.vibol;

import java.util.HashSet;

public class LinkListDemo {

	// it is reference variable our type we create with our Type Node:
	// Mean our Node have variable name head;
	Node head;

	// Operation Append (add one more element to the next)
	public void append(int data) {
		Node newNode = new Node(data);
		// We assign the header first start
		
		if (head == null) {
			head = newNode;
			return; // finish so we get the head of the LinkList node
		}
		
		// Else
		// 10->20>30 : if it have element we add one more element to the next
		// we create another variable name last to store the element

		Node last = head;
		while (last.next != null) {
			last = last.next;
			// this loop will shift to the next element
		}
		last.next = newNode;
	}

	// Print linkList
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}

	// add the beginning
	public void addAtBegginning(int data) {
		// step 1: create new node with the new data
		Node newNode = new Node(data);
		// Set newNode.next = head
		newNode.next = head;
		// set head = newNode
		head = newNode;
	}

	// add the beginning
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	public void addAfter(int preData, int newData) {
		Node current = head;
		
		// in the first create object current.data = 0;
		while (current != null && current.data != preData) {
			current = current.next;
		}
		
		if (current == null) {
			System.out.println("Node with data = " + preData + " not found!");
		}

		Node newNode = new Node(newData);
		newNode.next = current.next;
		current.next = newNode;
		
	}

	// Deleted operation

	public void deletedAtBeginning() {
		if (head == null) {
			System.out.println("List is empty");
			return; // prevent null pointer
		}
		head = head.next;
	}

	public void deletedAtEnd() {
		//check if the head = null		
		if (head ==null) {
			System.out.println("List is Empty");
			return;
		}
		
		//check if head have one element 
		if (head.next== null) {
			head = null;
			return;
		}
		
		// find the second last node 
		
		Node secondlast	= head;
		while(secondlast.next.next!=null) {
			secondlast = secondlast.next;
		}
		
		secondlast.next=null;			
		
	}
	
	// remove specific element [20]
	@SuppressWarnings("unused")
	public void removeByValue(int value) {
		
		// check head = null		
		if(head == null) {
			System.out.println("List is empty");
		}
		
		// check at the first element much the value we want to delete 
		// 20->30>40
		if(head.data == value) {
			head = head.next;
			return;
		}
		//==> 30->40
		
		// have more than 2 elements we need to move one by one 
		
		Node current = head;
		while(current.next !=null && current.next.data !=value) {
			current = current.next;
		}
		
		//after it find one by one can not find 
		
		if(current == null) {
			System.out.println("Node with data ="+value+" not found!");
		}
		
		// current.next.data =20 : we found it 
		current.next = current.next.next;		
	}
	
	// Reverse 
	public void reverse() {
		if(head == null || head.next ==null) {
			return; // Nothing to reverse 
		}
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		// 10->20->30->null ==> 30->20->10->null
		
		while(current !=null) {
			next = current.next; // store next node 
			current.next = prev; // reverse the link 
			prev = current;		// move prev forward 
			current = next;		// move current forward 
		}
		
		head = prev;
		
		// next = 20
		// current.next = (current head = 10) : 10->null *
		// prev = 10 
		// current = 20 	
		
	}
	
	// Find the middle node
	
	public Node findMiddle() {
		if(head ==null) {
			System.out.println("List is empty.");
			return null;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast !=null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle node value = "+slow.data);
		
		return slow;
	}
	
	// Find N-th Node from end 
	
	public Node findNthNodeFromEnd(int n) {
		
		//check if the linklist have node or not 
		if(head ==null) {
			System.out.println("List is empty.");
			return null;
		}
		
		Node first = head;
		Node second = head;
		
		
		// Loop Moving the n node from input 
		
		for(int i=0;i<n;i++) {
			if(first == null) {
				
				System.out.println("List has fewer than "+n + " node.");
				return null;
			}
			first = first.next;
		}
		
		// Move both pointer until first reach end 
		
		while (first !=null) {
			first = first.next;
			second = second.next;
		}
		System.out.println("The "+n +" th node from End is: "+second.data);
		
		return second;
	}
	
	// 4 RemoveDuplicateSorted	
	public void removeDuplicateSorted() {
		Node current = head;
		while(current !=null &current.next !=null) {
			if(current.data == current.next.data) {
				current.next=current.next.next; // skip Duplicate
			} else {
				current = current.next; // Move forward only if no duplicate
			}
		}
	}
	
	public void removeDuplicateUnorderList() {
		if(head == null) {
			return;
		}
		
		HashSet<Integer> set = new HashSet<>();
		Node current = head;
		Node prev = null;
		
		while(current!=null) {
			if(set.contains(current.data)) {
				// remove duplicate
				prev.next = current.next;
			}else {
				set.add(current.data);
				prev = current;
			}
			current = current.next;
		}
	}
	
	
	
}











