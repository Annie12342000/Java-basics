package com.annie.regex;

public class Split {

	public static void main(String[] args) {
		String s1 = "ab+bc+cd";
		String [] a = s1.split("\\+");
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
