package com.example.creational.singletone;

public class LazyLoading {
	
	private static volatile LazyLoading instance;// This should be volatile
	private LazyLoading() {}
	
	public static LazyLoading getInstanceByDoubleLockCheck() {
		if(instance == null) {
			synchronized (LazyLoading.class) {
				if(instance == null) {
					instance = new LazyLoading();
				}
			}
		}
		return instance;
	}
	
	//To overcome serialization issue
	protected Object readResolve() {
		return getInstanceByDoubleLockCheck();
	}
}
