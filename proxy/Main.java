package com.haormj.proxy;
/**
 * 
 * @author ourdream
 * 入口
 */
public class Main {
 
	public static void main(String[] args) {
		IBuyTicket ticket = new TicketBuyer("李四");
		TicketProxy proxy = new TicketProxy(ticket);
		proxy.login();
		proxy.station("北京", "西安");
		proxy.validate();
		proxy.payMoney();
	}
	
}
