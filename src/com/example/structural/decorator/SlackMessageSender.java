package com.example.structural.decorator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SlackMessageSender extends BaseComponentDecorator {
	private Component c;

	public SlackMessageSender(Component c) {
		super(c);
	}

	@Override
	public String send(String data) {
		// TODO Auto-generated method stub
		return "Slack : " + c.send(data);
	}
}
