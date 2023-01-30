package com.annie.Comparator;

import com.annie.Comparable.Book;

public class PriceMain {
	public static void main(String[] args) {
		Book b1 = new Book(233.56);
		Book b2 = new Book(3732.89);
		Pricecomp p=new Pricecomp();
		System.out.println(p.compare(b1,b2));
	}

}
