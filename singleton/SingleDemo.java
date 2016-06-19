package com.haormj.design;

public class SingleDemo {
	
	public static void main(String[] args) {
		
		CouriersThread thread1 = new CouriersThread("线程1");
		CouriersThread thread2 = new CouriersThread("线程2");
		thread1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
	}
	
	
}
