package com.haormj.proxy;
/**
 * 
 * @author ourdream
 * 抽象接口
 */
public interface IBuyTicket {
	
	public void login();
	public void station(String start, String end);
	public void validate();
	public void payMoney();
	
}
