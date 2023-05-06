package com.annie.datastructures;

public class SingleLinkedList {

	//public static void main(String[] args) {
	  
		private Node first = null;
		private int count = 0;
		private Node last = null;

	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			last = first;
			count++;
			return;

		}

		last.next = new Node(e, null);

		last = last.next;
		count++;

	}

	public int size() {
		return count;
	}

	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}

		return curr.ele;
	}

	public void add(int index, Object e) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		  	
		if (index == 0) {
			first = new Node(e, first);
			count++;
			return;
		}

		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;

		}

		curr.next = new Node(e, curr.next);
		count++;

	}

	public void remove(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			first = first.next;
			count--;
			return;

		}

		Node curr = first;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}

		curr.next = curr.next.next;
		if (index == size() - 1) {
			last = curr;
		}
		count--;
	}

	public void clear() {
		first = null;
		last = null;
		count = 0;

	}

	public String toString() {
		if (size() == 0)
			return "[]";
		Node curr = first;
		String s = "[" + curr.ele;

		while (curr.next != null) {
			curr = curr.next;
			s = s + "," + curr.ele;
		}

		s += "]";
		return s;

	}
}
