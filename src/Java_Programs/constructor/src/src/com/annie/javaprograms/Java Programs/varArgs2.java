class varArgs2

{
	static void m2(int...a)
	{
		System.out.println("executing m2()");	
        for(int n:a)
		{
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	static void m1(int... a)
	{
				System.out.println("executing m1()");	
		

		for(int n:a)
		{
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		m2(2,4);
		m1(3,5,6,7,8,9,0);
	}
	
}
