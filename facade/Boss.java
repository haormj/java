package com.haormj.facade;

public class Boss {

	public static void main(String[] args) {
		System.out.println("我要出差了 小王");
		Facade facade = new Facade();
		facade.travel("美国", 30);
	}
	
	
}
