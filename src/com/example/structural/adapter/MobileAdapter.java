package com.example.structural.adapter;

import lombok.Value;

@Value
public class MobileAdapter implements VoltAdapter {

	private WallSocket wallSocket = new WallSocket();

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(wallSocket.getVolt(), 40);
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(wallSocket.getVolt(), 10);
	}

	@Override
	public Volt get60Volt() {
		// TODO Auto-generated method stub
		return convertVolt(wallSocket.getVolt(), 2);
	}

	private Volt convertVolt(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts()/i);
	}

}
