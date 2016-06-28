package com.haormj.flyweight;

public class Main {

	public static void main(String[] args) {
		IPrize p1 = PrizeFactory.getIPrize("法拉利");
		p1.luckDraw("没中奖");
		IPrize p2 = PrizeFactory.getIPrize("大米一袋");
		p2.luckDraw("中奖");
	}
	
	
}
