package com.annie.string;

public class Palindrome {
	public static void main(String[] args) {
	 System.out.println(isPalindrome("Malayalam"));
	}
	 static boolean isPalindrome(String s) {
		 s=s.toLowerCase();
			char [] a = s.toCharArray();
			int i = 0, j = a.length-1;
			while(i<j)
			{
				if (a[i]!=a[j])
					return false;
				i++;
				j--;
			}
			
			return true;
			
		}
		}

	

