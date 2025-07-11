package com.vibol.Datastructure;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		
		stack.push("Java");
		stack.push("Spring");
		stack.push("Kafka");
		
		System.out.println("Top: " +stack.peek());
		System.out.println("Remove: " + stack.pop());
		System.out.println("Now Top: "+ stack.peek());
	}

}
