package com.design.pattern.singleton;

public class SingleLazyLoadingDoubleLocking {

	private static SingleLazyLoadingDoubleLocking singleLazyLoadingDoubleLocking;
	
	private SingleLazyLoadingDoubleLocking() {
		
	}
	
	public static SingleLazyLoadingDoubleLocking getInstance() {
		if(singleLazyLoadingDoubleLocking == null) {
			synchronized (SingleLazyLoadingDoubleLocking.class) {
				if(singleLazyLoadingDoubleLocking == null) {
					singleLazyLoadingDoubleLocking = new SingleLazyLoadingDoubleLocking();
				}
			}
		}
		return singleLazyLoadingDoubleLocking;
	}
}
