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

		@Override
		public String toString() {
			return "NODE " + data;
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
		System.out.println();
	}

	public int size() {
		return this.size;
	}

	public void addLast(int item) {
		// create a new node
		Node newNode = new Node(item, null);
		if (this.size == 0)
			this.head = newNode;
		else
			this.tail.next = newNode;

		this.tail = newNode;
		this.size++;
	}

	public void addFirst(int item) {
		// create a new node
		Node newNode = new Node(item, null);
		if (this.size == 0)
			this.tail = newNode;
		else
			newNode.next = this.head;

		this.head = newNode;
		this.size++;
	}

	public int getFirst() {
		if (this.size == 0)
			throw new RuntimeException("LL is empty");
		return this.head.data;
	}

	public int getLast() {
		if (this.size == 0)
			throw new RuntimeException("LL is empty");
		return this.tail.data;
	}

	public int getAt(int index) {
		if (this.size == 0)
			throw new RuntimeException("List is Empty!!");
		if (index < 0 || index >= this.size)
			throw new RuntimeException("Invalid index!!");
		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Node getNodeAt(int index) {
		if (this.size == 0)
			throw new RuntimeException("List is Empty!!");
		if (index < 0 || index >= this.size)
			throw new RuntimeException("Invalid index!!");
		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int index, int item) {
		if (index == 0) {
			addFirst(item);
			return;
		}
		if (index == this.size) {
			addLast(item);
			return;
		}
		if (index < 0 || index > this.size)
			throw new RuntimeException("Invalid index!!");

		Node prev = getNodeAt(index - 1);
		Node newNode = new Node(item, prev.next);
		prev.next = newNode;
	}

	public int removeFirst() {
		if (this.size == 0)
			throw new RuntimeException("List is Empty!!");
		int val = this.head.data;
		if (this.size == 1) {
			this.head = this.tail = null;
			this.size--;
			return val;
		}
		this.head = this.head.next;
		this.size--;
		return val;
	}

	public int removeLast() {
		if (this.size == 0)
			new RuntimeException("List is Empty!!");
		int val = this.tail.data;
		if (this.size == 1) {
			this.head = this.tail = null;
			this.size--;
			return val;
		}
		this.tail = getNodeAt(this.size - 2);
		this.tail.next = null;
		this.size--;
		return val;

	}

	public int removeAt(int index) {
		if (this.size == 0)
			new RuntimeException("List is Empty!!");
		if (index < 0 || index > this.size) {
			new RuntimeException("Invalid index !!");
		}
		if (index == 0)
			return this.removeFirst();
		if (index == this.size - 1)
			return this.removeLast();

		Node prev = getNodeAt(index - 1);
		int val = prev.next.data;
		prev.next = prev.next.next;
		this.size--;
		return val;
	}

	public void reverseData() {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node l = this.getNodeAt(left);
			Node r = this.getNodeAt(right);

			int temp = l.data;
			l.data = r.data;
			r.data = temp;
			left++;
			right--;
		}
	}

	// by pointers iteratively & recursevily
	public void reverseList() {
		Node prev = null;
		Node curr = this.head;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

	public int mid() {
		Node fast = this.head;
		Node slow = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int kthNodeFromLast(int k) {
		if (k < 1 || k > this.size)
			throw new RuntimeException("Invalid k!!");
		Node fast = this.head;
		Node slow = this.head;

		for (int i = 1; i <= k; i++)
			fast = fast.next;

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

}
