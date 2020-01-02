package com.design.pattern.singleton;

public class SingletonDesignMainPattern {

	public static void main(String[] args) {
		
		SingletonNotThreadSafe singletonNotThreadSafe = SingletonNotThreadSafe.getInstance();
		SingletonNotThreadSafe singletonNotThreadSafeNew = SingletonNotThreadSafe.getInstance();
		System.out.println(singletonNotThreadSafe.hashCode() == singletonNotThreadSafeNew.hashCode()); 
		
		SingleLazyLoadingDoubleLocking singleLazyLoadingDoubleLocking = SingleLazyLoadingDoubleLocking.getInstance();
		SingleLazyLoadingDoubleLocking singleLazyLoadingDoubleLockingNew = SingleLazyLoadingDoubleLocking.getInstance();
		System.out.println(singleLazyLoadingDoubleLocking.hashCode() == singleLazyLoadingDoubleLockingNew.hashCode());
		
		SingletonCloneSafe singletonCloneSafe = SingletonCloneSafe.getInstance();
		SingletonCloneSafe singletonCloneSafeNew = SingletonCloneSafe.getInstance();
		System.out.println(singletonCloneSafe.hashCode() == singletonCloneSafeNew.hashCode());
		
		SingletonEagerLoading singletonEagerLoading = SingletonEagerLoading.getInstance();
		SingletonEagerLoading singletonEagerLoadingNew = SingletonEagerLoading.getInstance();
		System.out.println(singletonEagerLoading.hashCode() == singletonEagerLoadingNew.hashCode());
		
		SingletonSerializableSafe singletonSerializableSafe = SingletonSerializableSafe.getInstance();
		SingletonSerializableSafe singletonSerializableSafeNew = SingletonSerializableSafe.getInstance();
		System.out.println(singletonSerializableSafe.hashCode() == singletonSerializableSafeNew.hashCode());
		
		
		
	}
}


