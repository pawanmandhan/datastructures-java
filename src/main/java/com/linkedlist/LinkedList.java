package com.linkedlist;

public class LinkedList {

	private class Node {
		int data;
		Node next;

		Node() {
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void addLast(int item) {
		// create a new node
		Node newNode = new Node(item, null);
		if (this.size == 0) this.head = newNode;
		else this.tail.next = newNode;

		this.tail = newNode;
		this.size++;
	}

}
