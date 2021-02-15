package com.linkedlist;

public class LinkedListAsStack {
	
	private LinkedList stack;

	public LinkedListAsStack() {
		this.stack = new LinkedList();
	}

	public int size() {
		return this.stack.size();
	}

	public void push(int item) {
		this.stack.addFirst(item);
	}

	public int pop() {
		return this.stack.removeFirst();
	}

	public int top() {
		return this.stack.getFirst();
	}

	public boolean isEmpty() {
		return this.stack.isEmpty();
	}

	public void display() {
		this.stack.display();
	}

}
