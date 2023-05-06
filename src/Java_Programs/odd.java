
class odd

{
	public static void main(String[] args) 
	{
		int l=10;
		int u = 50;
		int a = 0,b=1,c;
		while (a<=u)
	
		{
			if( a>=l && a<=u && a%2!=0 )
			System.out.println(a);
				c=a+b;
				b=c;
				a=b;
			
		}
	}	
}
