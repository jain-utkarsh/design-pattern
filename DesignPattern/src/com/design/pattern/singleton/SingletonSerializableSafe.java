package com.design.pattern.singleton;

import java.io.Serializable;

public class SingletonSerializableSafe implements Serializable{

	private static SingletonSerializableSafe singletonSerializableSafe;
	
	private SingletonSerializableSafe() {
		
	}
	
	public static SingletonSerializableSafe getInstance() {
		if(singletonSerializableSafe == null) {
			synchronized (SingletonSerializableSafe.class) {
				if(singletonSerializableSafe == null) {
					singletonSerializableSafe = new SingletonSerializableSafe();
				}
			}
		}
		return singletonSerializableSafe;
	}
	
	protected Object readResolve() {
		return singletonSerializableSafe;
	}
}
