import java.util.Scanner;
class Patterntwo
{
	public static void main(String[] args) 
	{ Scanner scn=new Scanner(System.in);
	System.out.print("enter a size");
	  int n = scn.nextInt();
	  for(int i = 1;i<=n;i++)
		{
		  for(int j =i ; j<=n;j++)
			{if(i==j)
			  System.out.print("* ");
			  else
		System.out.print("#");
	}System.out.println();
}
	}
}