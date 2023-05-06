class varArgs
{
	public static void main(String[] args) 
	{
		m2(2,4);
		m2(3,5,6,7,8,9,0);
	}
	static void m2(int ... a){
		System.out.println("executing m2()");
		
	}
}
