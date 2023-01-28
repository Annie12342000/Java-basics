package com.annie.interfaceexamplepack;
class Washerman

{
	public void wash(Object obj)
	{
		if(obj instanceof Washable)
			System.out.println("use water to wash");
		else 
			System.out.println("this machine cannot be washed");
	}
}

interface Washable
{
	
}
class Bike implements Washable
{
	
}

class Car implements Washable
{
	
}

class Lowry implements Washable
{
	
}

class TV
{
	
}
public class MarkerInterface {

	public static void main(String[] args) {
		Washerman washer = new Washerman();
		washer.wash(new Car());
		washer.wash(new TV());
	}

}
