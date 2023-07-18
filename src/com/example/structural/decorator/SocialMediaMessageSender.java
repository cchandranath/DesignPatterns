package com.example.structural.decorator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SocialMediaMessageSender extends BaseComponentDecorator {
	private Component c;

	public SocialMediaMessageSender(Component c) {
		super(c);
	}

	@Override
	public String send(String data) {
		// TODO Auto-generated method stub
		return "Social media : " + c.send(data);
	}
}
