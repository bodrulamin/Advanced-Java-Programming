package com.advancedjava;

class RunnableEx implements Runnable {

	@Override
	public void run() {

		int i = 1;
		while (i <= 100) {
			System.out.println(i + " " + Thread.currentThread().getName());
			i++;
		}
	}

}

public class Exx12ThreadRunnable {

	public static void main(String[] args) {

	}
}
