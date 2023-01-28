package com.annie.string;

public class LowerUpper {

	public static void main(String[] args) {
		String s = "ABCDefg@1234";
		String Res = " ";
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				Res+= (char)(s.charAt(i)-32);
			
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				Res+= (char)(s.charAt(i)+32);
			
		}
         
		System.out.println(Res + "@1234");
	}

}
