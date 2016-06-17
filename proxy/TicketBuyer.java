package com.haormj.proxy;
/**
 * 
 * @author ourdream
 * 具体主题
 */
public class TicketBuyer implements IBuyTicket{
	
	private String name;
	
	public TicketBuyer(String name){
		this.name = name;
	}

	@Override
	public void login() {
		System.out.println("登陆12306");
	}

	@Override
	public void station(String start, String end) {
		System.out.println("起点:" + start + "终点:" + end);
	}

	@Override
	public void validate() {
		System.out.println(this.name + "通过身份验证");
	}

	@Override
	public void payMoney() {
		System.out.println(this.name + "抢到了火车票,同时完成了支付");
	}

}
