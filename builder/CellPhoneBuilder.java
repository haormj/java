package com.haormj.builder;

public interface CellPhoneBuilder {

	public void buildCpu();
	public void buildRam();
	public void buildScreen();
	public void buildBattery();
	public void buildFacade();
	public void buildOthers();
	
	public CellPhone getPhone();
	
}
