package com.annie.regex;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter email:");
		String email = scn.next();
		java.util.regex.Pattern p = java.util.regex.Pattern.compile("[A-Z a-z]\\S*(?=.*[0-9])\\S*@[a-z A-Z]+[.](com|co\\.in|ac\\.in)");
		java.util.regex.Matcher m = p.matcher(email);
				
		if(m.matches())
		{
			System.out.println("valid");
		}
			else
			{
				System.out.println("not valid");
			}


	}

}
