import java.util.Scanner;
class Niven 
{
	public static void main(String[] args) 
	{ 
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scn.nextInt();
		if(n<0)System.out.print("No negatives");
		else
		{
			int temp=n;
			int sum=0;
			while(n!=0)
			{
				int rem=n%10;
				System.out.print("remainder="+ rem);
				sum+=rem;
			
				System.out.print("sum=" +sum);
				n/=10;
				System.out.print("number=" +n);
				
				}
				if (temp%sum==0)System.out.println("Niven");
				else System.out.println("not niven");
				
				}
}
}
