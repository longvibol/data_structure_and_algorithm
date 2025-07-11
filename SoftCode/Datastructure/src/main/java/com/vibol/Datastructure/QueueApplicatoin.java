package com.vibol.Datastructure;

public class QueueApplicatoin {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue(3);
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(30);
		
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		queue.enqueue(40);
//		queue.enqueue(60); // it is full 
		System.out.println(queue.peek());
		
		System.out.println(2%3);
		
	}

}
