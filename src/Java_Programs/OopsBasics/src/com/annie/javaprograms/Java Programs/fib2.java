import java.util.Scanner;
class fib2

{
	public static void main(String[] args) 
	{  
		Scanner scn = new Scanner(System.in);
		System.out.print("enter a number");
		int n =scn.nextInt();
		int a =0,b=1,c;
		while(a<=n)
		{
			if(a==n)
			{
		System.out.print(n+"is a fib num");
		return;
		}
		 c=a+b;
		 a=b;
		 b=c;
		}
		System.out.print(n+"is not a Fib num");
	}
}
