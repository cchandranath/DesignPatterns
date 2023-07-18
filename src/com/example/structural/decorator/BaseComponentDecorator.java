package com.example.structural.decorator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseComponentDecorator implements Component {
	private Component c;

	BaseComponentDecorator(Component c) {
		this.c = c;
	}

	@Override
	public String send(String data) {
		// TODO Auto-generated method stub
		return c.send(data);
	}

}
