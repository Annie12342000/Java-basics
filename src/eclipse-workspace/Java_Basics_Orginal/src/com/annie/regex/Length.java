package com.annie.regex;

public class Length {

	public static void main(String[] args) {
		String s2 = " ";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile("([a-z])\\1*");
		java.util.regex.Matcher m = p.matcher("success");
		
		while(m.find()) {
		String temp = m.group();
		s2 = s2 +temp.length()+temp.charAt(0);
	    }
         System.out.println(s2);
		}
	}


//1s1u2c1e2s