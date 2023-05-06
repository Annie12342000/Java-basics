package com.annie.numbers;

public class NextPalindrome {
	static int isPalindrome(int num)
	{
		int temp,rem,rev=0;
		temp = num;
		while(num>0)
		{
			rem = num%10;
			rev = (rev *10)+rem;
			num/=10;
			
		}
		if(temp==rev)
		{
		  return 1;
		} 
		  else
		  {
			  
			  return 0;
		  }
	}

	public static void main(String[] args) {
		int num = 121;
		while(isPalindrome(num)==0)
		{
			num = num +1;
			System.out.println("next palindrome:");
			System.out.println(num);
		}

	}

}
