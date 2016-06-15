package com.haormj.design;

public class PeopleSingle {
	
	private static PeopleSingle instance = new PeopleSingle();
	
	private int number;
	
	private PeopleSingle(){
		
	}
	
	public static PeopleSingle getInstance(){
		return instance;
	}

	public String getAnswer(){
		return "�����ҵĵ�"+ (++number) +"�����";
	}
}
