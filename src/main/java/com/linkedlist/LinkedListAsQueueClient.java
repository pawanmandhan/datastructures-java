package com.linkedlist;

public class LinkedListAsQueueClient {
	
	public static void main(String[] args) {
		LinkedListAsQueue queue = new LinkedListAsQueue();
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.display();
		System.out.println(queue.deQueue());
		queue.display();
		System.out.println(queue.front());
	}

}
