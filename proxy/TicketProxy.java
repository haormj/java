package com.haormj.proxy;
/**
 * 
 * @author ourdream
 * 代理主题
 */
public class TicketProxy implements IBuyTicket{

	private IBuyTicket ticket;
	
	public TicketProxy(IBuyTicket ticket){
		this.ticket = ticket;
	}
	
	
	@Override
	public void login() {
		this.ticket.login();
		
	}

	@Override
	public void station(String start, String end) {
		this.ticket.station(start, end);
		
	}

	@Override
	public void validate() {
		this.ticket.validate();
		
	}

	@Override
	public void payMoney() {
		this.ticket.payMoney();
		
	}

}
