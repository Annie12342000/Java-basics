import java.util.Scanner;
class div 
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("enter a number:");
		int n = new Scanner(System.in).nextInt();
		System.out.println("the divisors of number:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i + "\t");
			}
		}
	}
}
