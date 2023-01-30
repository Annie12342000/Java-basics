package com.annie.regex;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter password");
		String password = scn.next();
		String re = "(?=.*[!@#$%^&*-+])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9].{6,10})";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(re);
		java.util.regex.Matcher m = p.matcher(password);
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

