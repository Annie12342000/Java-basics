package com.annie.string;



//public class Last  
//{  
//public static void main(String[] args)   
//{  
//String string="Google";  
////invoking method  
////string=StringUtils.chop(string);  //
////prints the string after chopping the last character  
//System.out.println(string);  
//}  
//}  
public class RemoveLastChar 
{  
public static void main(String[] args)   
{  
//object of the class  
RemoveLastChar rlc = new RemoveLastChar();  
String s="Welcome to Javatpoint";  
//method calling  
s=rlc.removeLastChar(s);        
//prints the string   
System.out.println(s);  
}  
//method to remove last character  
public String removeLastChar(String s)   
{  
//returns the string after removing the last character  
return s.substring(0, s.length() - 1);  
}   
}  