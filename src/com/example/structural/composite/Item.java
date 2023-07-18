package com.example.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item implements Component {
	private final double value;
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.getValue();
	}

}
