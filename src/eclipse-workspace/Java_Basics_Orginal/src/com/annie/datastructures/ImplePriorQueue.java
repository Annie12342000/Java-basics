package com.annie.datastructures;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class ImplePriorQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(30);
		q.add(40);
		q.add(50);
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		

	}

}
