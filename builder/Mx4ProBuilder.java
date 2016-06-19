package com.haormj.builder;

public class Mx4ProBuilder implements CellPhoneBuilder{

	CellPhone mx = new Mx4ProCellPhone();
	
	@Override
	public void buildCpu() {
		mx.setCpu("三星cpu");
	}

	@Override
	public void buildRam() {
		mx.setRam("3G内存");
		
	}

	@Override
	public void buildScreen() {
		mx.setScreen("5.5寸");
		
	}

	@Override
	public void buildBattery() {
		mx.setBattery("3300MA");
		
	}

	@Override
	public void buildFacade() {
		mx.setFacade("土豪金");
		
	}

	@Override
	public void buildOthers() {
		mx.setOthers("指纹识别");
		
	}

	@Override
	public CellPhone getPhone() {
		return mx;
	}

}
