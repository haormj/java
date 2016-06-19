package com.haormj.builder;

public class Main {

	public static void main(String[] args) {
		CellPhoneDirector director = new CellPhoneDirector();
		CellPhone mate = director.buildMate7();
		System.out.println(mate);
		CellPhone mx = director.buildMx4();
		System.out.println(mx);
	}
	
}
