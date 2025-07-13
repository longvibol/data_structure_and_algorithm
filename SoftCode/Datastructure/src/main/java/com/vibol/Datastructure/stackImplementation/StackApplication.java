package com.vibol.Datastructure.stackImplementation;

public class StackApplication {

	public static void main(String[] args) {

		MyStackChatGPT stack = new MyStackChatGPT(5);
		stack.push(20);
		stack.push(10);
		stack.push(5);
//		stack.push(2);
//		stack.push(1);
		
		int peek = stack.peek();
		
//		System.out.println(peek);
		int pop = stack.pop();
		System.out.println(pop);
		
	}

}
