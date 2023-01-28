package com.annie.overridingpack;
class Manu
{
	public void bindi()
	{
		System.out.println("yes bindi");
	}
}
class Roopa extends Manu
{   @Override
	public void bindi()
	{
		System.out.println("yes bindi");
	}
}
class Annie extends Manu
{   @Override
	public void bindi()
	{
		System.out.println("no bindi");
	}
}

public class Friendship {
	public static void main(String[] args) {
		Roopa r =  new Roopa();
		r.bindi();
		
		Annie a = new Annie();
		a.bindi();
		
		Manu m = new Manu();
		m.bindi();
		
		
		
		
		
	}

}
