package com.haormj.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PrizeFactory {

	private static Map<String, IPrize> map = new HashMap<String, IPrize>();

	private PrizeFactory() {
	}

	public static IPrize getIPrize(String prizeName) {
		IPrize prize = map.get(prizeName);
		if (prize == null) {
			prize = new ConcretePrize(prizeName);
			map.put(prizeName, prize);
		}
		return prize;
	}

}
