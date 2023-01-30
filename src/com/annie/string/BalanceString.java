package com.annie.string;

import java.util.Stack;

public class BalanceString {

	public static void main(String[] args) {
		System.out.println(isBalance("[{}]()"));

	}

	static boolean isBalance(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			if(c1=='{' || c1=='[' || c1=='(')
				stack.push(c1);
			else if(c1=='}' || c1==']' || c1==')')
			{if(stack.isEmpty() || !pair(stack.pop(),c1))
				return false;
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	static boolean pair(char c1,char c)
	{
		if(c1=='(' && c==')')	return true;
		if(c1=='{' && c=='}')	return true;
		if(c1=='[' && c==']')	return true;
		return false;
	}
}
