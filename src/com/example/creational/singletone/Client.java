package com.example.creational.singletone;

public class Client {
	public static void main(String[] arg) {
		LazyLoading obj1 = LazyLoading.getInstanceByDoubleLockCheck();
		LazyLoading obj2 = LazyLoading.getInstanceByDoubleLockCheck();
		System.out.print("Is two objects are same? ");
		System.out.println(obj1.hashCode() == obj2.hashCode());

		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = BillPughSingleton.getInstance();
		System.out.print("Is two objects are same? ");
		System.out.println(instance1.hashCode() == instance2.hashCode());

		NTone nTone1 = NTone.getInstance(10);
		NTone nTone2 = NTone.getInstance(10);
		System.out.print("Is two objects are same? ");
		System.out.println(nTone1.hashCode() == nTone2.hashCode());
	}
}
