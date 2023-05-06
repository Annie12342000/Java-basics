package com.annie.casting;

public class perm {
public static void main(String[] args) {
	permutation("abc", 0, 2);
	
}
public static String swap(String s,int i,int j) {
	char []a=s.toCharArray();
	char temp = a[i];
	a[i] = a[j];
	a[j]= temp;
	return new String (a);
}

public static void permutation(String s, int start, int end )
{
	if(start==end)
	{
		System.out.println(s);
		return;
	}
	for(int i= start;i<=end;i++)
	{
		String str = swap(s, start,i);
		permutation(str, start+1, end);
	}
}
}
