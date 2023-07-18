package com.example.structural.composite;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item(1.0);
		Item item2 = new Item(2.0);
		Item item3 = new Item(3.0);
		Item item4 = new Item(4.0);
		Item item5 = new Item(5.0);
		List<Item> itemsPack1 = Arrays.asList(item1, item2);
		List<Item> itemsPack2 = Arrays.asList(item3, item4);
		List<Item> itemsPack3 = Arrays.asList(item5);
		Box leafBox1 = new Box(itemsPack3, 0.10);
		Box leafBox2 = new Box(leafBox1, itemsPack2, 0.10);
		Box mainBox = new Box(leafBox2, itemsPack1, 0.50);

		System.out.println("Total pack value: " + mainBox.getPrice());
	}

}
