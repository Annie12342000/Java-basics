package com.annie.string;

public class Occurence {

	public static void main(String[] args) {
	String s = "engineering";
	int count = 0;
	char c = 'e';
	
	for(int i = 0;i<s.length();i++)
	{
		if(c==s.charAt(i))
		{
			count++;
		}
	}
			System.out.println("total no. of occurences:" +count);
		
	}
	

	}


