package com.annie.regex;

public class ReplaceAll {

	public static void main(String[] args) {
		String s1 = "j1a2v3a";
		System.out.println(s1.replace("[0-9]", " "));
		System.out.println(s1.replaceAll("[0-9]", " "));

	}

}
