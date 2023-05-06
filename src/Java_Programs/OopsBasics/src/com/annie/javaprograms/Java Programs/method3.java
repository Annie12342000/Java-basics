class method3
{
	 static void m1(int a) 
	{
		 a*=2;
		System.out.println("in m1,a="+a);
	}
	public static void main(String [] args)
	{
		int a = 10;
		m1(a);
		System.out.println("in main,a="+a);
}
}
