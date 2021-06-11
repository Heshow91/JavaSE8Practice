package com.intertech.collectionsqueue;

import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.offerFirst("Hisham");
		deque.offerFirst("Wayel");
		deque.offerLast("Braxton");
		deque.offerFirst("Korakot");
		deque.offerLast("Garett");
		deque.offerLast("Sahi");
		System.out.println(deque);
		
		System.out.println(deque.pollLast());
		
		System.out.println(deque.pollFirst());
		deque.pollFirst();
		
		System.out.println(deque);
	}

}
