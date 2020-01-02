package com.design.pattern.structural.flyweight;

import com.design.pattern.structural.flyweight.PlayerFactory.PlayerType;

public class FlyweightDesignMain {

	public static void main(String[] args) {
		Player terrorist1 = PlayerFactory.getPlayer(PlayerType.TERRORIST);
		Player terrorist2 = PlayerFactory.getPlayer(PlayerType.TERRORIST);
		
		Player counterterrorist1 = PlayerFactory.getPlayer(PlayerType.COUNTERTERRORIST);
		Player counterterrorist2 = PlayerFactory.getPlayer(PlayerType.COUNTERTERRORIST);
		
		terrorist1.playerWork();
		terrorist2.playerWork();
		counterterrorist1.playerWork();
		counterterrorist2.playerWork();
		
		System.out.println(terrorist1.hashCode() ==  terrorist2.hashCode());
		System.out.println(counterterrorist1.hashCode() == counterterrorist2.hashCode());
	}

}
