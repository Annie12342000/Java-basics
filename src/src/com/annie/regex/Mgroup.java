package com.annie.regex;

import java.util.Scanner;

public class Mgroup {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string:");
		String s = scn.next();
		java.util.regex.Pattern p = java.util.regex.Pattern.compile("([a-z])\\1");
		java.util.regex.Matcher m = p.matcher(s);
				
		while(m.find())
		{
			System.out.println(m.group());
		}		
		System.out.println("done");
		
	}


	}

