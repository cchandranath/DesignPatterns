package com.example.structural.decorator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SMSMessageSender extends BaseComponentDecorator {
	private Component c;

	public SMSMessageSender(Component c) {
		super(c);
	}

	@Override
	public String send(String data) {
		// TODO Auto-generated method stub
		return "SMS : " + c.send(data);
	}
}
