package com.haormj.decorator;
/**
 * 
 * @author ourdream
 * 抽象装饰类,实现了和ConcreteCar的同样功能
 */
public abstract class CarDecorator implements Icar{

	private Icar car;
	
	public CarDecorator(Icar car){
		this.car = car;
	}
	
	@Override
	public void show() {
		car.show();
	}
	
}
