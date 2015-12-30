package com.coderwurst.composite_patterns;

public class Simulator {
	
	public static void main (String [] args) {
		
		Item nut = new Part("Nut", 5);
		nut.getCost();
		Item bolt = new Part("Bolt", 9);
		bolt.getCost();
		Item washer = new Part("Washer", 3);
		washer.getCost();
		Item panel = new Part("Penel", 12);
		panel.getCost();
		
		Item gizmo = new Assembly("Gizmo");
		gizmo.addItem(nut);
		gizmo.addItem(bolt);
		gizmo.addItem(washer);
		gizmo.addItem(panel);
		
		Item widget = new Assembly("Widget");
		widget.addItem(nut);
		widget.addItem(bolt);
		
		gizmo.getCost();
		widget.getCost();
		
	}

}
