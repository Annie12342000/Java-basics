package com.annie.datastructures;

public class MyArrayList {
	private Object [] a = new Object[5];
	private int pos = 0;
	
	public void add(Object e)
	{
		if(pos>=a.length)
			increase();
		a[pos++] = e;
	}
	
	void increase()
	{
		Object [] temp = new Object[a.length + 3];
		for(int i = 0; i<a.length; i++)
		{
			temp[i] = a[i];
		}
		
		a = temp;
	}
	
	public int size()
	{
		return pos;
	}
    
	public void add (int index,Object e)
	{
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
		if(pos>=a.length)
			increase();
		for(int i = size()-1;i>=index;i--)
		{
			a[i+1] = a[i];
		}
		a[index] = e;
		pos++;
		
	}
	
	public void remove(int index,Object e)
	{
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
		for ( int i = index+1;i<=size();i++)
		{
			a[i-1] = a[i];
		}
		pos--;
		a[pos] = null;
	}
	
	public Object get(int index)
	{
		if(index<=-1||index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	public void clear()
	{
		a = new Object[5];
		pos = 0;
	}
	
	public String toString()
	{
		if(size()==0)
		{
			return "[]";
		}
		
		String s = "[" + a[0];
		for(int i = 1;i<size();i++)
		{
			s+= "," + a[i];
		}
		
		
		return s+= "]";
	}
	
	public static void main(String[] args) {
		MyArrayList l = new MyArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(80);
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		System.out.println("size =" +l.size());
		l.get(3);
		System.out.println("get=" +l.get(3));
		l.remove(2,60);
		System.out.println("remove=" +l);
	}

}	

