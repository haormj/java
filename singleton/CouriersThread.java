package com.haormj.design;

import java.util.Random;

public class CouriersThread extends Thread {

	String[] couriers = { "˳��", "����", "��ͨ", "��ͨ", "Բͨ" };
	String threadName = "";

	public CouriersThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		PeopleSingle person = PeopleSingle.getInstance();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName + ":����,����" + couriers[random.nextInt(couriers.length)] + ",���Ŀ�ݵ���,����ȡ��");
			System.out.println("�ش�:" + threadName + person.getAnswer());
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
