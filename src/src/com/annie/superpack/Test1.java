package com.annie.superpack;
////class E
////{
////	public E()
////	{
////		System.out.println("Good Morning");
////	}
////}
////class F extends E
////{
////	public F()
////	{
////		super(45);
////		System.out.println("Good Evening");
////	}
////}
////
////public class Test1 {
////	public static void main(String[] args) {
////		new F();
////		
////	}
////
////}
//

class Animal{  

	Animal(){System.out.println("animal is created");}  
	String color="white";  
void eat(){System.out.println("eating...");}  


}  
class Dog extends Animal{  
	
	Dog(){  
		super();  
		System.out.println("dog is created");  
	}
	
String color="black";  

void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}

void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark(); 
eat();
}  

}  

class Test1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  

d.work();  

}}  

//class Animal{  
//String color="white";  
//}  
//class Dog extends Animal{  
//String color="black";  
//void printColor(){  
//System.out.println(color);//prints color of Dog class  
//System.out.println(super.color);//prints color of Animal class  
//}  
//}  
//class Test1{  
//public static void main(String args[]){  
//Dog d=new Dog();  
//d.printColor();  
//}}  