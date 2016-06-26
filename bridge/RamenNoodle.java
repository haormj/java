package com.haormj.bridge;

public class RamenNoodle extends Noodle {

	public RamenNoodle(ISeasoning seasoning) {
		super(seasoning);
	}

	@Override
	public void getNoodle() {
		System.out.println(seasoning.addSeasoning() + "的拉面");
	}

}
