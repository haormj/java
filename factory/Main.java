package com.haormj.factory;

public class Main {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product p = creator.factory(ConcreteProduct.class);
		p.method1();
		p.method1();
	}
}
