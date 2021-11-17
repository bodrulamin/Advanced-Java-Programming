package com.advancedjava;

class ThreadEx extends Thread {

	@Override
	public void run() {

		int i = 1;
		while (i <= 100) {
			System.out.println(i + " " + this.getName());
			i++;
		}
	}

}

public class Exx11ThreadClass {

	public static void main(String[] args) {

	ThreadEx thread1 = new ThreadEx();
	thread1.setName("My first Thread");
	thread1.start();

	ThreadEx thread2 = new ThreadEx();
	thread2.setName("My second Thread");
	thread2.start();

	}

}
