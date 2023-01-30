package com.annie.string;

public class Demo2 {

	public static void main(String[] args) {
		String s1="Hello";
		
		for(int i=0;i<s1.length();i++)
			{//char c=s1.charAt(i);
			//System.out.println(c);
			
			System.out.println(s1.charAt(i));
			}
		
		char[] a=s1.toCharArray();
		for(char ch:a)
		{
			System.out.print(ch+" ");
		}
	}

}
