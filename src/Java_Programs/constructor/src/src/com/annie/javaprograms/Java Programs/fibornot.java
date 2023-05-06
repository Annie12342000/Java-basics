
class Fib 
{
	public static void main(String[] args) 
	{
		int n =50;
		int a =0,b=1,c;
		while(a<=n)
		{
			if(a==n)
			{
		System.out.println(n+"is a fib num");}
		 c=a+b;
		 a=b;
		 b=c;
		}
	}
}
