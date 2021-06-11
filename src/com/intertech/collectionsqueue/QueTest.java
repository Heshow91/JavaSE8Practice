package com.intertech.collectionsqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class QueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
		queue.offer("Hisham Raihan");
		queue.offer("Wayel Raihan");
		queue.offer("Braxton");
		queue.offer("Korakot");
		queue.offer("Garett");
		queue.offer("Sahi");
		System.out.println(queue);
		String person = (String)queue.poll(); // pulls first element
		System.out.println(person);
		String nextPerson = (String)queue.peek();// shows what's next without removing
		System.out.println(nextPerson);
	}

}
