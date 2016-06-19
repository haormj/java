package com.haormj.builder;

public class CellPhoneDirector {
	
	private CellPhoneBuilder builder;
	
	
	public Mate7CellPhone buildMate7(){
		builder = new Mate7Builder();
		builder.buildCpu();
		builder.buildRam();
		builder.buildBattery();
		builder.buildFacade();
		builder.buildOthers();
		builder.buildScreen();
		return (Mate7CellPhone)builder.getPhone();
		
	}
	
	public Mx4ProCellPhone buildMx4(){
		builder = new Mx4ProBuilder();
		builder.buildCpu();
		builder.buildRam();
		builder.buildBattery();
		builder.buildFacade();
		builder.buildScreen();
		builder.buildOthers();
		return (Mx4ProCellPhone)builder.getPhone();
	}
	
}
