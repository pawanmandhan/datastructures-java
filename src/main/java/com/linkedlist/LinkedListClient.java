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
		System.out.println("mid " + list.mid());
		System.out.println("getAt() " + list.getAt(2));
		System.out.println("getNodeAt() " + list.getNodeAt(2));
//		list.addAt(1, 1234);
//		list.removeFirst();
		System.out.println("removeAt " + list.removeAt(2));
		list.display();
		list.reverseList();
		list.display();
		System.out.println("mid " + list.mid());
		list.display();
		System.out.println("kth from last " + list.kthNodeFromLast(0));
	}

}
