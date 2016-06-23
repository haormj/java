package com.haormj.decorator;

public class ConcreteCar implements Icar{

	@Override
	public void show() {
		System.out.println("这个是我们刚刚购买的车,没有装饰也没有在玻璃外面贴标签");
	}

}
