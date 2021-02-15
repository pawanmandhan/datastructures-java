package com.linkedlist;

public class LinkedListAsStackClient {
	
	public static void main(String[] args) {
		LinkedListAsStack stack = new LinkedListAsStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.top());
		
	}

}
