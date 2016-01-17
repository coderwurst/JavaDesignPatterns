package com.coderwurst.prototype_patterns;

public class VehicleManagerLazy {
	
	private Vehicle saloon, coupe, sport, boxVan, pickup;
	
	public VehicleManagerLazy() {
		
	}
	
	public Vehicle createSaloon() {
	
		if (saloon == null) {
			saloon = new Saloon (new StandardEngine(1300));
			System.out.println("New Saloon created with LazyVehicleManager");
			return saloon;
		} else {
			System.out.println("Previous Saloon returned with LazyVehicleManager");
			return (Vehicle) saloon.clone();
		}
	}
	
	public Vehicle createCoupe() {
		
		if (coupe == null) {
			System.out.println("New Coupe created with LazyVehicleManager");
			coupe = new Coupe (new StandardEngine(1300));
			return coupe;
		} else {
			System.out.println("Previous Coupe returned with LazyVehicleManager");
			return (Vehicle) coupe.clone();
		}
	}
	
	public Vehicle createSport() {
		
		if (sport == null) {
			sport = new Sport (new StandardEngine(1300));
			System.out.println("New Sport created with LazyVehicleManager");
			return sport;
		} else {
			System.out.println("Previous Sport returned with LazyVehicleManager");
			return (Vehicle) sport.clone();
		}
	}
	
	public Vehicle createBoxVan() {
		
		if (boxVan == null) {
			boxVan = new Saloon (new StandardEngine(1300));
			System.out.println("New Boxvan created with LazyVehicleManager");
			return boxVan;
		} else {
			System.out.println("Previous Box Van returned with LazyVehicleManager");
			return (Vehicle) boxVan.clone();
		}
	}
	
	public Vehicle createPickup() {
		
		if (pickup == null) {
			pickup = new Pickup (new StandardEngine(1300));
			System.out.println("New Pickup created with LazyVehicleManager");
			return pickup;
		} else {
			System.out.println("Previous Pickup returned with LazyVehicleManager");
			return (Vehicle) pickup.clone();
		}
	}

}
