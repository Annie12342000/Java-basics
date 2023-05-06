//class methodA 
{
	public static void main(String[] args) 
	{
		m1();
		int i = m1();
		System.out.println("i="+i);
		int j = m1()*2;
		System.out.println("j="+j);
		System.out.println(m1());
	}
	static int m1(){
		System.out.println("executing m1()");
		return 10;
	}
}
class Add 
{
	public static void main(String[] args) 
	{
		System.out.println(add (20,30));
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 2 nums");
		int x=scn.nextInt();
		int y=scn.nextInt();
		System.out.println(add(x,y));
	}
	static int add (int a,int b) 
	{
		return a+b;
	}
}


