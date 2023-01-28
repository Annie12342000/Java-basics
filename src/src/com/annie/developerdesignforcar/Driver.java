package com.annie.developerdesignforcar;

public class Driver
{
	public void drive (Car car)
	{
		car.start();
		car.accelerate();
		car.stop();
	}
	
	public void accessBluetooth(Car car)
	{
		//Swift swift = (Swift) car;
		//swift.bluetooth();
		
boolean i;

		
		i = (car instanceof Audi);
		System.out.println(i);
		
		if(car instanceof Audi)
		((Audi)car).bluetooth();
		
		if(car instanceof Swift)
	    ((Swift)car).bluetooth();
	}
	
//  public void drive(Swift swift)
//  {
//	  swift.start();
//	  swift.accelerate();
//	  swift.stop();
//	  
//  }
//  
//  public void drive(Audi audi)
//  {
//	  audi.start();
//	  audi.accelerate();
//	  audi.stop();
//	  
//  }
//  public void drive(Benz benz)
//  {
//	  benz.start();
//	  benz.accelerate();
//	  benz.stop();
//	  
//  }
}

