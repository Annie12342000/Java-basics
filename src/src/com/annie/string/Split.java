package com.annie.string;

public class Split {

	public static void main(String[] args) {
		String s1 = "java is an oops lang";
		String [] arr = s1.split("an");
		for(String s:arr) {
			System.out.println(s);
		}

	}

}
