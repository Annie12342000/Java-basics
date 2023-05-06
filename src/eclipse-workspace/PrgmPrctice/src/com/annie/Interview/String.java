package com.annie.Interview;

public class String {
	
	 public static void main ( String [] args)
	 {
	 java.lang.String s = "java|test";
	 char [] a = s.toCharArray();
	 java.lang.String s1 = " ";
	 java.lang.String s2 = " ";
	 for(int i = 0 ; i<a.length;i++)
	 {
	 if(i==4)
	 {
	 break;
	 }
	 s2+=" ";
	 }
	 System.out.println(s2);
	 }
	 }
