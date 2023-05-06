package com.annie.datastructures;

public class DemoSingle {

	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(70);
        System.out.println(l);
        System.out.println(l.get(3));
        System.out.println(l.size());
        l.clear();
        System.out.println(l);
	}

}
