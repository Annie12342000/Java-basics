import java.util.Scanner;
class primeRange

{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a range:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println("prime nums between +a+ and +b");
		for(int i=a;i<=b;i++)
		{
			if (i<=1)
				continue;
			boolean flag=true;
			for(int j = 2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)System.out.println(i);

			
			}
	}
}
