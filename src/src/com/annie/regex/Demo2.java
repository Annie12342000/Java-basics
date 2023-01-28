package com.annie.regex;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter phone number");
		String phnnum = scn.next();
		java.util.regex.Pattern p = java.util.regex.Pattern.compile("[6-9][0-9]{9}");
		java.util.regex.Matcher m = p.matcher(phnnum);
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

