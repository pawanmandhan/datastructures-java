package com.linkedlist;

public class LinkedListClient {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(50);
		list.display();
	}

}
