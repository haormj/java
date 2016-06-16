package com.haormj.factory;

public interface Creator {
 
	public <T extends Product> T factory(Class<T> clazz);
	
}
