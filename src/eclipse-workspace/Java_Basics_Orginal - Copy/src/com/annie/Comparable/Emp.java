package com.annie.Comparable;

public class Emp implements Comparable{
	String name;
	int id;
	double sal;
	private static int n =101;
	{
		id = n;
		n++;
		
	}
	public Emp(String n,double s)
	{
		name = n;
	
		sal=s;
		
	}

	@Override
	public int compareTo(Object o) {
		Emp e = (Emp)o;
		return name.compareTo(e.name);
//		if(sal>e.sal)return -1;
//		if(sal<e.sal)return 1;
//		return 0;
	}

}
