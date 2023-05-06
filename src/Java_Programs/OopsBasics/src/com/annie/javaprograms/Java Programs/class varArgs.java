class varArgs
{
	static void m2(int...a)
	{
		System.out.println("executing m2()");	
	}
	static void m1(int... a)
	{
					System.out.println(n+ "executing m1() ");

		for(int n:a)
		{
			System.out.println(n+ "executing m1() ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		m2(2);
		//m2(3,5,6,7,8,9,0);
	}
	
}
