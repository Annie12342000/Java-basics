class method
{
	static void m1(int n) 
	{
		System.out.println("n="+ n);
	}
	public static void main(String [] args)
    {
		m1(10);
		m1(20*3);
		int a =5;
		m1(a);
		m1(a+3);
	}
}

