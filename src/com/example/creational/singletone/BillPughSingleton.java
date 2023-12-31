package com.example.creational.singletone;

public class BillPughSingleton {
	private BillPughSingleton() {}
	
	/**
	 * Notice the private inner static class that contains the instance of the singleton class. 
	 * When the singleton class is loaded, SingletonHelper class is not loaded into memory 
	 * and only when someone calls the getInstance method, this class gets loaded and creates 
	 * the Singleton class instance.
	 * @author Chandranath
	 *
	 */
	private static class SingleToneHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingleToneHelper.instance;
	}
}
