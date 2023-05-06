package com.annie.string;

public class Rev {

	public static void main(String[] args) {
		String s = "java is an oops lang";
		String [] arr = s.split(" ");
		String  s1 = " ";
		for(int i = arr.length - 1; i>=0; i--)
		{
			s1+=arr[i];
			s1+= " ";
			
		}
        
		s1=s1.trim();
		System.out.println(s1);
	}

}
