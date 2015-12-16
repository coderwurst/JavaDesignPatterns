package com.coderwurst.prototype_patterns;

public class VehicleManager {
	
	private Vehicle saloon, coupe, sport, boxVan, pickup;
	
	public VehicleManager() {
		// for simplicity, all vehicles will get the same engine
		saloon = new Saloon(new StandardEngine(1300));
		coupe = new Coupe(new StandardEngine(1300));
		sport = new Sport(new StandardEngine(1300));
		boxVan = new BoxVan(new StandardEngine(1300));
		pickup = new Pickup(new StandardEngine(1300));
	}
	
	public Vehicle createSaloon() {
		System.out.println("Saloon created with VehicleManager");
		return (Vehicle) saloon.clone();
	}
	
	public Vehicle createCoupe() {
		System.out.println("Coupe created with VehicleManager");
		return (Vehicle) coupe.clone();
	}
	
	public Vehicle createSport() {
		System.out.println("Sport created with VehicleManager");
		return (Vehicle) sport.clone();
	}
	
	public Vehicle createBoxVan() {
		System.out.println("Box Van created with VehicleManager");
		return (Vehicle) boxVan.clone();
	}
	
	public Vehicle createPickup() {
		System.out.println("Pickup created with VehicleManager");
		return (Vehicle) pickup.clone();
	}

}
