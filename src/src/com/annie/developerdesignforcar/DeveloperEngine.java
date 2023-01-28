package com.annie.developerdesignforcar;

public class DeveloperEngine {
	public static void main(String[] args) {
		Driver driver1 = new Driver();
		driver1.drive(new Swift());
		driver1.accessBluetooth(new Audi());
//		driver1.drive(new Swift());
		
		Car car1 = new Car();
		Swift swift1 = new Swift();
		
		boolean i;
		
		i = (car1 instanceof Audi);
		System.out.println(i);
		i = (swift1 instanceof Car);
		System.out.println(i);
//		
//		System.out.println("888888888888888");
//		
//		driver1.drive(new Audi());
//		
//		System.out.println("888888888888888");
//
//		
//		driver1.drive(new Benz());
		
		
		
	}
	

}
