package com.vibol.Datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("User1");
		queue.offer("User2");
		queue.offer("User3");
		
		System.out.println("Front: " + queue.peek());
		System.out.println("Remove: " + queue.poll());
		System.out.println("Now Front: " + queue.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
