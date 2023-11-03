package com.sunbeam;

public class SinglyLinearLL {
	public class node {
		private int data;
		private node next;

		public node(int value) {
			data = value;
			next = null;
		}
	}

	private node head;
	private node tail;
	private int count;

	public SinglyLinearLL() {
		head = null;
		tail = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return (head == null && tail == null);

	}

	public void addLast(int value) {
		node newnode = new node(value);

		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else if (head.next == null)

		{
			tail = newnode;
			head.next = tail;

		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void displayall() {
		node trav = head;
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}

	}

	public void addFirst(int value) {
		node newnode = new node(value);
		if (isEmpty()) {
			head = newnode;
		} else if (head.next == null) {
			head.next = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			head = head.next;
		}

	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else if (head.next == null) {
			head = null;
		} else {
			node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;

			}

			tail = trav.next;
			trav.next = null;

		}

	}
}
