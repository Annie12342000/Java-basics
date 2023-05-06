import java.util.Scanner;
class fib 
{
	public static void main(String[] args) 
	{
		System.out.println("enter num digits:");
		int n= new Scanner(System.in).nextInt();
		int a = 0,b=1,c;
		for(int i=1;i<=n;i++){
			System.out.println(a+"\t");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
