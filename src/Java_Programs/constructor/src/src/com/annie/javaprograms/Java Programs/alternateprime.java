import java.util.Scanner;
class alternateprime 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("alternate prime nums between " +a+ " and" +b);
		int count=0;
		for(int i=a; i<=b;i++){
			if(i<=1) continue;
			boolean flag= true;
			for(int j=2;j<=i/2;j++)
				{
				if(i%j==0)
					{
					flag=false;
					break;
	}
				}
		

    if (flag)
	{
		count++;
		if(count%2!=0)
	 System.out.print(i + " ");
		}
		
	}
}
}
