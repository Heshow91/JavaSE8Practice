package com.intertech.collectionsqueue;

import java.util.PriorityQueue;

public class PriorityQueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("Hisham");
		queue.offer("Wayel");
		queue.offer("Braxton");
		queue.offer("Korakot");
		queue.offer("Garett");
		queue.offer("Sahi");
		System.out.println(queue);
		// will prioritize based on alphabetical order
		String person = (String)queue.poll(); // pulls first element
		System.out.println(person);
		person = (String) queue.poll();
		System.out.println(person);
		person = (String) queue.poll();
		System.out.println(person);
		person = (String) queue.poll();
		System.out.println(person);
		person = (String) queue.poll();
		System.out.println(person);
		person = (String) queue.poll();
		System.out.println(person);
		

}
}