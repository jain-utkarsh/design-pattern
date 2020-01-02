package com.design.pattern.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {

	private static HashMap<PlayerType, Player> playerList = new HashMap<>(); 
	
	public static Player getPlayer(PlayerType playerType) {
		if(playerList.get(playerType) != null) {
			return playerList.get(playerType); 
		}else {
			if(playerType == PlayerType.TERRORIST) {
				Player terrorist = new Terrorist();
				playerList.put(playerType, terrorist);
				return terrorist;
			}else {
				Player counterterrorist = new CounterTerrorist();
				playerList.put(playerType, counterterrorist);
				return counterterrorist;
			}
		}
	}
	
	enum PlayerType{
		TERRORIST , COUNTERTERRORIST;
	}
}
