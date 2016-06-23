package com.haormj.decorator;

public class Main {

	public static void main(String[] args) {
		Icar car = new ConcreteCar();
		car = new CarConcreteDecorator(car);
		car.show();
	}
	
}
