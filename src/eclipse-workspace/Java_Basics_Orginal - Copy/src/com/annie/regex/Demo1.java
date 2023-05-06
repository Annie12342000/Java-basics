package com.annie.regex;



public class Demo1 {

	public static void main(String[] args) {
		java.util.regex.Pattern p = java.util.regex.Pattern.compile("[0-9]{3}");
		java.util.regex.Matcher m = p.matcher("123");
		//while(m.find())
		//{
			//System.out.println("start=" +m.start());
			//System.out.println("end=" +m.end());
			//System.out.println("group=" +m.group());
		//}
		System.out.println(m.matches());

	}

}
