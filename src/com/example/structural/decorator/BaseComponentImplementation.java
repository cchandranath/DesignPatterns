package com.example.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BaseComponentImplementation implements Component {
	private String data;
	
	@Override
	public String send(String data) {
		// TODO Auto-generated method stub
		return "Sending message :" + data;
	}
}
