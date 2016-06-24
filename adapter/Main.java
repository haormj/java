package com.haormj.adapter;

public class Main {

	public static void main(String[] args) {
		//其实适配器做的就是将adaptee转化为目标的接口
		//在我们这个例子中,adapter 继承原来的类,同时实现接口,这样就可以使用IEnglish了,其实目标还是为了使用IEnglish这个接口
		IEnglish english = new Adapter();
		String e = english.speakEnglish();
		System.out.println(e);
	}
	
}
