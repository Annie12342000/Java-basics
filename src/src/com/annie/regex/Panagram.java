package com.annie.regex;

public class Panagram {

	public static void main(String[] args) {
		String s1;
		panagram("adgfjygyiu131431");
		
	}
	
	static boolean panagram(String s1)
	{
		for (char c ='a';c<='z';c++)
		{
			if(s1.indexOf(c)==-1)
			
				return false;
		}
				return true;
		}
}
