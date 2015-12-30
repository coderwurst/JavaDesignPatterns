package com.coderwurst.composite_patterns;

public class Part extends Item {

	public Part(String description, int cost) {
		super(description, cost);
	}

	/*
	 * below methods have empty implementations as Part is the smallest unit and 
	 * cannot have any smaller sub classes
	 */
	
	@Override
	public void addItem(Item item) {}

	@Override
	public void removeItem(Item item) {}

	@Override
	public Item[] getItems() { return new Item[0]; }

}
