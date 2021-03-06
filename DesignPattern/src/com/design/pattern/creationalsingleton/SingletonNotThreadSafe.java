package com.design.pattern.creationalsingleton;

/*
 * Singleton Not Thread Safe.
 */
public class SingletonNotThreadSafe {

	private static SingletonNotThreadSafe singletonNotThreadSafe;
	
	private SingletonNotThreadSafe() {	
	}
	
	public static SingletonNotThreadSafe getInstance() {
		if(singletonNotThreadSafe == null) {
			singletonNotThreadSafe = new SingletonNotThreadSafe();
		}
		return singletonNotThreadSafe;
	}
}
