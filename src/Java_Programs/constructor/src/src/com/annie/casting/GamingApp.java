package com.annie.casting;
class Animal
{
	public void drink()
	{
		System.out.println("Water is the need of animals");
	}
	public void sound()
	{
		
	}
	public void movement()

     {
		
	 }
}
class Lion extends Animal
{ @Override 
	public void sound()
	
	{
	  System.out.println("Lion roars");	
	}

    @Override	
	public void movement()
	{
		System.out.println("Runs");
		
	}
    
	public void eatFood()
	{
		System.out.println("Hunts for food");
	}
}
class Snake extends Animal
{   @Override
	public void sound()
	{
		System.out.println("hhhhsssss");
		
	}
    @Override
	public void movement()
	{
		System.out.println("nagin");
		
	}
    
	public void venomUse()
	{
		System.out.println("Snake venom is medicinal");
	}
}
public class GamingApp {

	public static void main(String[] args) {
		Animal animal = new Lion();
		animal.drink();
		animal.sound();
        animal.movement();
        
        Lion lion = (Lion) animal;
        lion.eatFood();
        
        System.out.println("***************************");
        Animal animal1 = (Animal) new Snake();
        animal1.drink();
        animal1.sound();
        animal1.movement();
        
        
        ((Snake)animal1).venomUse();
       
	}
	

}
//517941954858