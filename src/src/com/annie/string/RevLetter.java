package com.annie.string;

public class RevLetter {

	public static void main(String[] args) {
		String s1 = "java is an oops lang";
		String [] arr = s1.split(" ");
		String s2 = " ";
		
		for(String s:arr)
		{
			s2+= rev(s);
			s2+=" ";
			
		}

	
	s2.trim();
	System.out.println(s2);
	

}
	static String rev(String s) {
		String s2 = " ";
		
		for(int i = s.length()-1; i>=0;i--)
		{
		  s2+=s.charAt(i);
		  
		}
		return s2;
	}
}