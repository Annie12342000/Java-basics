package com.annie.string;

public class Reverse {

	public static void main(String[] args) {
		String s = "abcd";
		String Rev = " ";
		for (int i = s.length()-1; i>=0; i--)
		{
			Rev+= s.charAt(i);
			
		}
        
		System.out.println(Rev);
	}

}
