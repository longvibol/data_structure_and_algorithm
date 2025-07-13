package com.vibol.Datastructure;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.addFirst("Front 1");
		deque.addLast("Back 1");
		deque.addFirst("Front 2");
		
		System.out.println(deque); // [Front 2, Front 1, Back 1]
		System.out.println("Remove Front: " + deque.removeFirst()); //Remove Front: Front 2
		System.out.println("Remove Back: " + deque.removeLast()); // Remove Back: Back 1
		
	}

}
