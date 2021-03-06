package com.coderwurst.composite_patterns;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends Item {

	private List<Item> items;
	
	public Assembly(String description) {
		super(description, 0);
		items = new ArrayList<Item>();
	}

	/*
	 * below methods have empty implementations as Part is the smallest unit and 
	 * cannot have any smaller sub classes
	 */
	
	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public Item[] getItems() {
		return items.toArray(new Item[items.size()]);
	}

	/* this method is overridden to total the cost of the items in the list, 
	 * as opposed to cost of an individual Item
	 */
	@Override
	public int getCost() {
		int total = 0;
		for (Item item : items) {
			total += item.getCost();
		}
		return total;
	}

}
