package com.coderwurst.decorator_patterns;

public class SatNavVehicle extends AbstractVehicleOption {

	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle);
	}
	
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1500;
	}

}
