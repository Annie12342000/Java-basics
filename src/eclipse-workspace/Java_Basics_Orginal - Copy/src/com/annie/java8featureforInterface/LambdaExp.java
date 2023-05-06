package com.annie.java8featureforInterface;
@FunctionalInterface
interface Bank

{
  void rateOfInterest();	
}
public class LambdaExp {

	public static void main(String[] args) {
		Bank bank = ()->
		
			System.out.println("rate of interest is 12%");
			
		
			bank.rateOfInterest();
		}
		

	}

