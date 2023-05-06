class star1 
{
	public static void main(String[] args) 
	{   
		int n =20;
		int spaces=n/2;stars=1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print("");
			}
			for(int j=1;j<=stars;j++)
			{
		System.out.println("*");
	}
	System.out.println();
	if(i<=n/2)
			{spaces--;
	         stars+=2;
}
else{spaces++;
	stars-=2;
}
if(j==1||j==stars)
			{
				System.out.print("*");
			}
			else{
				System.out.print("");
		}
	}
}

}