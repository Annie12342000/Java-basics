package com.annie.java8featureforInterface;
@FunctionalInterface
interface Bank1

{
  void rateOfInterest();	
}
 class HDFC implements Bank1
 {   @Override
	 public void rateOfInterest()
 {
	 System.out.println("14% is the roi");
 }
	 
 }
public class Lambda2 {

	public static void main(String[] args) {
		Bank1 bank = new HDFC();
		
					
		
			bank.rateOfInterest();
		}
		

	}

