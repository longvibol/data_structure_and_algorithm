package com.vibol.Datastructure.stackImplementation;

public class MyStack {

	private int[] array;
	private int top;
	private int capacity;

	// Initial value to the implement
	public MyStack(int size) {
		// first we need to set the size of our Array
		array = new int[size];
		this.capacity = size;
		// first we setup the top to -1 to set our array to no empty value
		top = -1;
	}

	// Method push button
	public void push(int item) {
		// We need to check the capacity first

		if (top == capacity - 1) {
			throw new RuntimeException("Stack overflow");
		}

		// first we assign the first index = 0 to the Array by add + 1
		top = top + 1;
		array[top] = item;
	}

	// Method Peek (return the value but remove item)

	public int peek() {
		// check if it is empty first
		if (top == -1) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}
	
	// Method Pop 
	public void pop() {
		
		
		
	}		
	
	
	
	
	
}
