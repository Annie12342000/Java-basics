package com.annie.datastructures;

public class SingleLinkedList {
	
	class Node{
		Object ele;
		Node next;
		
		public Node(Object ele,Node next)
		{
			this.ele = ele;
			this.next = next;
			
		}
	}

	private Node first = null;
	private int count = 0;
	
	public void add(Object e)
	{
		if(first == null)
		{
			first = new Node(e,null);
			count++;
			return;
			
		}
		
		Node curr = first;
		while(curr.next!=null)
		{
			curr = curr.next;
		}
		
		curr.next = new Node(e,null);
		count++;
		return;
	}
	
	public int size()
	{
		return count;
	}
	
	public Object get(int index)
	{
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
		Node curr = first;
		for(int i = 1; i<=index; i++)
		{
			curr = curr.next;
		}
		return curr.ele;
		
	}
	
	public void add (int index,Object e)
	{
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first = new Node(e,null);
			count++;
			return;
		}
		Node curr = first;
		for(int i = 1;i<index;i++)
		{
			curr = curr.next;
		}
		curr.next = new Node(e,curr.next);
		 count++;
		 
	}
	
	public void remove(int index)
	{
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
	    if(index==0)
	    {
	    	first= first.next;
	    	count--;
	    	return;
	    	
	    }
	    
	    Node curr= first;
	    for(int i = 1;i<index;i++)
	    {
	    	curr = curr.next;
	    }
	    curr.next = curr.next.next;
	    count--;
		
	}
	
	public void clear() 
	{
		first = null;
		count = 0;
	}
	
	public String toString()
	{
		if(size()==0)
			return "[]";
		Node curr = first;
		String s = "[" +curr.ele;
		while(curr.next!=null)
		{
			curr = curr.next;
		
		s += "," + curr.ele;
		}
		return s+= "]";
	
	}
	
	public void reverse()
	{
		Node curr = first;
		Node next = null;
		Node prev = null;
		while ( curr!=null)
		{
			
			prev = curr;
			curr = next;
			next = curr.next;
			
		}
		
		first = prev;
	}
	
	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
		l.add(68);
		l.add(899);
		l.add(890);
		l.add(448);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(1));
		l.add(2, 50);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);

	}
}
