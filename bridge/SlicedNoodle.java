package com.haormj.bridge;

public class SlicedNoodle extends Noodle {

	public SlicedNoodle(ISeasoning seasoning) {
		super(seasoning);
	}

	@Override
	public void getNoodle() {
		System.out.println(seasoning.addSeasoning() + "的刀削面");
	}

}
