package com.vibol;

import java.util.LinkedList;

public class JavaLinkListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.addFirst("Mango");
		list.addLast("Orange");
		
		System.out.println(list); // output: [Mango, Apple, Banana, Orange]
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list); // output: [Apple, Banana]
		
		// In LinkList it is maintains the order 
		
	}

}
