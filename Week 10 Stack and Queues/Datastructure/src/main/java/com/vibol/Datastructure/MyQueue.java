package com.vibol.Datastructure;

public class MyQueue {
	
	private int[] array;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public MyQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		front=0; // we assing to zero becuase we want to add and remove 
		rear = -1; // at the rear it not yet have so we assign -1
		size=0; // want to know now we reach to capacity yet that why we create size 
	}
	
	// for Queue we add from the rear and get the server from front 
	
	public void enqueue(int item) {
		// we start add item from rear 
		if (size == capacity) {
			throw new RuntimeException("Queue is Full");
		}
		rear=(rear+1)%capacity;
		array[rear]=item;
		size++;		
	}
	
	public int dequeue() {
		if(size == 0) {
			throw new RuntimeException("Queue is Empty");
		}
		
		int result = array[front];
		front = (front +1)%capacity;

		size--;
		return result;
	}
	
	public int peek() {
		if(size == 0) {
			throw new RuntimeException("Queue is Empty");
		}
		return array[front];
	}

}
