package com.vibol.Datastructure.stackImplementation;

import java.util.Arrays;

public class MyStackChatGPT {

	private int[] array;
	private int top;
	private int capacity;

	// Initial value to the implement
	public MyStackChatGPT(int size) {
		// first we need to set the size of our Array
		array = new int[size];
		this.capacity = size;
		// first we setup the top to -1 to set our array to no empty value
		top = -1;
	}
	
    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack overflow");
        }
        array[++top] = item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

	
	

}
