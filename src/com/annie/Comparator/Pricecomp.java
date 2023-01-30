package com.annie.Comparator;

import java.util.Comparator;

import com.annie.Comparable.Book;

public class Pricecomp implements Comparator{
//    double price;
//    public Pricecomp(double p)
//    {
//    	price = p;
//    	
//    }
//
//
//public String toString() {
//	return "[" + "price:" +price + "]";
//	}


public int compare(Object o1, Object o2) {
	Book b1 = (Book)o1;
	Book b2 = (Book)o2;
	if(b1.price>b2.price)return 1;
	if(b1.price<b2.price)return -1;
	return 0;
	
}
}
