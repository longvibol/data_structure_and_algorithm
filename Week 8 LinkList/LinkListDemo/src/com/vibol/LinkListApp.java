package com.vibol;

public class LinkListApp {

	public static void main(String[] args) {

		LinkListDemo list = new LinkListDemo();
		list.append(30);
		list.append(20);
		list.append(40);
		list.append(50);
		list.append(40);
		list.append(60);
		
//		list.addAtBegginning(5);		
//		list.addAtEnd(50);
//		
//		list.append(80);
//		
//		list.addAfter(30, 35);
//		//list.printList();
//		
//		list.deletedAtBeginning();
		//list.printList();
//		list.deletedAtEnd();
		//list.printList();
		
//		list.removeByValue(10);
//		list.printList();
//		list.reverse();
//		list.printList();
		
//		list.findMiddle();
//		list.printList();		
		//list.findNthNodeFromEnd(3);
		
//		list.removeDuplicateSorted();
		list.removeDuplicateUnorderList();
		list.printList();
		
	}

}
