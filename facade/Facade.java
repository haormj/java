package com.haormj.facade;

public class Facade {

	private Airport air = new Airport();
	private Hotel hotel = new Hotel();
	private Driver driver = new Driver();
	
	public void travel(String to,int days){
		air.bookTicket("公司", to);
		hotel.boolRoom(days);
		driver.drive("机场");
	}
	
}
