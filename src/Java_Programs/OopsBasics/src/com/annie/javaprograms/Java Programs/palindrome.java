import java.util.Scanner;
class palindrome
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int reverse=0;
		int remainder;
		System.out.println("the number before reverse:"+num);
		int c = num;
		while(num>0){
			remainder=num%10;
			reverse=(reverse*10)+remainder;
			num=num/10;
		}
		if(c==reverse)
		System.out.println("given number is a palindrome number");
		else
		System.out.println("given number is not a palindrome number");


	}
}
