package com.vibol.Datastructure;

public class PriorityQueue {

	public static void main(String[] args) {

	java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(); // from small to big sort
//	java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>((a,b)->b-a); // from big to small sort 
	
	pq.offer(30);
	pq.offer(10);
	pq.offer(20);
	
	System.out.println("Top: "+ pq.peek()); // Top: 10
	System.out.println("Remove: "+ pq.poll()); // Remove: 10
	System.out.println("Top: "+ pq.peek()); // Top: 20
	
	}

}
