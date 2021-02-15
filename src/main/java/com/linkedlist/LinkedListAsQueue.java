package com.linkedlist;

public class LinkedListAsQueue {

	private LinkedList queue;

	public LinkedListAsQueue() {
		this.queue = new LinkedList();
	}

	public int size() {
		return this.queue.size();
	}

	public void enQueue(int item) {
		this.queue.addLast(item);
	}

	public int deQueue() {
		return this.queue.removeFirst();
	}

	public int front() {
		return this.queue.getFirst();
	}

	public boolean isEmpty() {
		return this.queue.isEmpty();
	}

	public void display() {
		this.queue.display();
	}

}
