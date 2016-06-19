package com.haormj.builder;

public class Mate7Builder implements CellPhoneBuilder {

	CellPhone mate = new Mate7CellPhone();

	@Override
	public void buildCpu() {
		mate.setCpu("华为自主研发cpu");

	}

	@Override
	public void buildRam() {
		mate.setRam("使用3G内存");

	}

	@Override
	public void buildScreen() {
		mate.setScreen("6寸");

	}

	@Override
	public void buildBattery() {
		mate.setBattery("4100MA");

	}

	@Override
	public void buildFacade() {
		mate.setFacade("琥珀金");

	}

	@Override
	public void buildOthers() {
		mate.setOthers("指纹识别");

	}

	@Override
	public CellPhone getPhone() {
		return mate;
	}

}
