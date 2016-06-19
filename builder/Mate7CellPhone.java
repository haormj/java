package com.haormj.builder;

public class Mate7CellPhone extends CellPhone {

	public Mate7CellPhone() {
		System.out.println("这个是华为手机");
	}

	@Override
	public String toString() {
		return "Mate7CellPhone [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getScreen()=" + getScreen()
				+ ", getBattery()=" + getBattery() + ", getFacade()=" + getFacade() + ", getOthers()=" + getOthers()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
