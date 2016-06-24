package com.haormj.adapter;

public class Adapter extends Chinese implements IEnglish {

	@Override
	public String speakEnglish() {
		String chinese = super.speakChinese();
		System.out.println("我是adapter,翻译["+ chinese +"]中..." );
		String english = "Could you please tell me your name?";
		return english;
	}

}
