package com.haormj.design;

import java.util.Random;

public class CouriersThread extends Thread {

	String[] couriers = { "顺丰", "天天", "申通", "中通", "圆通" };
	String threadName = "";

	public CouriersThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		PeopleSingle person = PeopleSingle.getInstance();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName + ":您好,我是" + couriers[random.nextInt(couriers.length)] + ",您的快递到了,请来取回");
			System.out.println("回答:" + threadName + person.getAnswer());
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
