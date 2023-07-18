package com.example.structural.adapter;

public class Client {
	public static void main(String[] args) {
		MobileAdapter adapter = new MobileAdapter();
		System.out.println("Mobile Adapter : " + adapter.get3Volt() + " volts");
	}
}
