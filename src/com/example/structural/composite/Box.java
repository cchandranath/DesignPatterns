package com.example.structural.composite;

import java.util.List;

import lombok.Data;

@Data
public class Box implements Component {
	private Box box;
	private List<Item> items;
	private double packageCost;

	public Box(Box box, double packageCost) {
		this.box = box;
		this.packageCost = packageCost;
	}

	public Box(List<Item> items, double packageCost) {
		this.items = items;
		this.packageCost = packageCost;
	}

	public Box(Box box, List<Item> items, double packageCost) {
		this.box = box;
		this.items = items;
		this.packageCost = packageCost;
	}

	public void addItem(Item item) {
		this.getItems().add(item);
	}

	public void removeItem(Item item) {
		this.getItems().remove(item);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		double total = 0;
		if (this.getBox() != null) {
			total += this.getBox().getPrice();
		}
		total += this.getItems().stream().mapToDouble(Item::getPrice).sum();
		return total + this.getPackageCost();
	}
}
