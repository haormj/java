package com.haormj.builder;

/**
 * 
 * @author ourdream 抽象产品类
 */
public abstract class CellPhone {

	private String cpu;
	private String ram;
	private String screen;
	private String battery;
	private String facade;
	private String others;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getFacade() {
		return facade;
	}

	public void setFacade(String facade) {
		this.facade = facade;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

}
