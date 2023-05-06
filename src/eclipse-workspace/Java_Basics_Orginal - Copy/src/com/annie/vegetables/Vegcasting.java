package com.annie.vegetables;
import java.util.Scanner;
class Vegetable
{
	
}

class Carrot extends Vegetable
{
	public void prepareCarrotHalwa() //specific method
	{
		System.out.println("Halwa is a traditional sweet of India");
	}
	
}

class Potato extends Vegetable
{
	public void prepareFrenchFries() // sm
	{
		System.out.println("French fries is good for health");
	}
}

class Shopkeeper
{
	public Vegetable sell(String vegName)
	{
		if(vegName.equalsIgnoreCase("Carrot")) return new Carrot();
		if(vegName.equalsIgnoreCase("Potato")) return new Potato();
		System.out.println(vegName + "is not available");
		return null;
	}
}
public class Vegcasting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vegetable:");
		String vegName = scan.nextLine();
		
		Shopkeeper shop = new Shopkeeper();
		Vegetable veg = shop.sell(vegName);
		
		if (veg instanceof Carrot)
			((Carrot)veg).prepareCarrotHalwa(); // downcasting
		
		if (veg instanceof Potato)
			((Potato)veg).prepareFrenchFries(); // downcasting
		

	}

}
