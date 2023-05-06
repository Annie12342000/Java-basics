package com.annie.datastructures;


public class DoublyLinkedList {

	class Node{
		Object ele;
		Node next;
		Node prev;
		public Node(Object ele, Node next, Node prev) {
			
			this.ele = ele;
			this.next = next;
			this.prev = prev;
		}
	}
	private Node first = null;
	private Node last = null;
	private int count = 0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null,null);
		    last = first;
		    count++;
		    return;
		}
		
		last.next=new Node(e,null,last);
		last=last.next;
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public Object get(int index)
	{
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		Node curr= first;
		for(int i =1;i<=index;i++)
		{
			curr=curr.next;
			
		}
		
		return curr.ele;
		
		
	}
	
	public void add (int index,Object ele)
	{
		if(index<=-1||index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0)
		{
			Node n = new Node(ele,first,null);
			
		}
		
	}
	{
		
	}
	
	
	
	
}
