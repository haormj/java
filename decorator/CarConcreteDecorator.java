package com.haormj.decorator;

public class CarConcreteDecorator extends CarDecorator{

	public CarConcreteDecorator(Icar car){
		super(car);
	}

	public void addFirst(){
		System.out.println("我给他添加了外部装饰");
	}
	
	public void addSecond(){
		System.out.println("我给玻璃外面贴了东西");
	}
	
	@Override
	public void show() {
		super.show();
		addFirst();
		addSecond();
	}
	
}
