package com.haormj.builder;

public class Mx4ProCellPhone extends CellPhone {

	public Mx4ProCellPhone() {
		System.out.println("这个是魅族4");
	}

	@Override
	public String toString() {
		return "Mx4ProCellPhone [getCpu()=" + getCpu() + ", getRam()=" + getRam() + ", getScreen()=" + getScreen()
				+ ", getBattery()=" + getBattery() + ", getFacade()=" + getFacade() + ", getOthers()=" + getOthers()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
