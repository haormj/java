package com.haormj.bridge;

public abstract class Noodle {

	protected ISeasoning seasoning;
	
	public Noodle(ISeasoning seasoning){
		this.seasoning = seasoning;
	}
	
	public abstract void getNoodle();
	
	
}
