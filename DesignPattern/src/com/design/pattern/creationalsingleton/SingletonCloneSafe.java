package com.design.pattern.creationalsingleton;

public class SingletonCloneSafe implements Cloneable {
	
	private static SingletonCloneSafe singletonCloneSafe;
	
	private SingletonCloneSafe() {
		
	}
	
	public static SingletonCloneSafe getInstance() {
		if(singletonCloneSafe == null) {
			synchronized (SingletonCloneSafe.class) {
				if(singletonCloneSafe == null) {
					singletonCloneSafe = new SingletonCloneSafe();
				}
			}
		}
		return singletonCloneSafe;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
