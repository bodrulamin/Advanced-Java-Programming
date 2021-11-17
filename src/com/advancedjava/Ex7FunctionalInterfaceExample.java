package com.advancedjava;

import com.advancedjava.*;
import java.util.HashMap;

@FunctionalInterface
interface GreetingMessage {

	abstract void greet(String name);
}

public class Ex7FunctionalInterfaceExample {

	public static void main(String[] args) {

		GreetingMessage gm = new GreetingMessage() {
			@Override
			public void greet(String name) {
				System.out.println("Assalamu Alaikum " + name);
			}
		};

		gm.greet("Bodrul Amin");

		GreetingMessage gm2 = (String name) -> {

			System.out.println("Assalamu Alaikum " + name);
		};

		gm2.greet("Bodrul");

	
	}

}
