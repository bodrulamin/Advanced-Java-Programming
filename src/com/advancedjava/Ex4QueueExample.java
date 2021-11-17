package com.advancedjava;


import com.advancedjava.*;
import java.util.LinkedList;


public class Ex4QueueExample {

	public static void main(String[] args) {
		LinkedList<String> customerList = new LinkedList<>();

		customerList.add("Bodrul Amin");
		customerList.add("Amina");
		customerList.add("Emma");
		customerList.add("Ben");


		System.out.println(customerList);
		customerList.poll();  // FiFo
		

		System.out.println(customerList);
	}

}
