/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.advancedjava;

/**
 *
 * @author b
 */
public class Varargs {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		String[] items = {"bread", "apples", "mango"};
		printShoppingList(items);

	}

	private static void printShoppingList(String... items) {
		for (String item : items) {
			System.out.println(item);
		}
	}

}
