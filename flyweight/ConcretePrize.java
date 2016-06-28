package com.haormj.flyweight;

public class ConcretePrize implements IPrize{

	private String prizeName;
	public ConcretePrize(String prizeName){
		this.prizeName = prizeName;
	}
	@Override
	public void luckDraw(String result) {
		if("中奖".equals(result)){
			System.out.println("恭喜中了大奖,奖品是" + prizeName);
		}else {
			System.out.println("很遗憾,您没有中奖");
		}
	}

}
