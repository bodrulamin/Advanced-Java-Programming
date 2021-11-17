package com.advancedjava;

import com.advancedjava.*;
import java.util.HashMap;



public class Ex8LambdaExample {

	public static void main(String[] args) {


		GreetingMessage gm = new GreetingMessage() {
			@Override
			public void greet(String name) {
				System.out.println("Assalamu Alaikum " + name);
			}
		};


		gm.greet("Bodrul Amin");
	}

}
