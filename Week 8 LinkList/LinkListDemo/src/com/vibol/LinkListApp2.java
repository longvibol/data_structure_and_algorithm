package com.vibol;

public class LinkListApp2 {

	public static void main(String[] args) {

		LinkListDemo list1 = new LinkListDemo();
		list1.append(20);
		list1.append(30);
		list1.append(40);
		
		LinkListDemo list2 = new LinkListDemo();
		
		list2.append(10);		
		list2.append(15);
		list2.append(22);
		
		
//		Node mergedList = LinkListDemo2.mergeTwoLinkList(list1.head, list2.head);
		Node mergedList = LinkListDemo2.mergeSortList(list1.head, list2.head);		
		LinkListDemo2.printList2(mergedList);
		
	}

}
