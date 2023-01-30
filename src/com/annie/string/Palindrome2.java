package com.annie.string;

public class Palindrome2 {

	public static void main(String[] args) {
		String s = "malayalam";
		
		for(int i = 0; i<s.length()-1; i++)
		{
			for(int j = i+2; j<=s.length(); j++)
			{
				String str = s.substring(i, j);
				if(isPalindrome(str))
					System.out.println(str);
						
			}
		}

	}
	
	static boolean isPalindrome(String s)
	{
		char[] a = s.toCharArray();
		int i = 0; int j = s.length()-1;
		while (i<j)
		{
			if(a[i]!= a[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}
