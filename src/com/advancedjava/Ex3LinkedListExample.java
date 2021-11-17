package com.advancedjava;
import java.util.LinkedList;


public class Ex3LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		ll.add("A");
		ll.add("B");
		
		ll.add(1, "C");

		System.out.println(ll);
	}

}
