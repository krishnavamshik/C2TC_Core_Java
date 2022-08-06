package com.Headfirst.phrase;

public class ThreadTest {

	public static void main(String[] args) {

		Thread T1 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("high");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		Thread T2 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Low");
				try {
					Thread.sleep(500);
				} catch (Exception e1) {
				}
			}
		});
		T1.start();
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		T2.start();
		try {
			T1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		try {
			T2.join();
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		System.out.println(T1.isAlive());
		System.out.println("bye");
	}
}
