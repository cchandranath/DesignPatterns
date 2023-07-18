package com.example.structural.decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component c1 = new SocialMediaMessageSender(new SMSMessageSender());
		System.out.println(c1.send("My data"));
	}

}
