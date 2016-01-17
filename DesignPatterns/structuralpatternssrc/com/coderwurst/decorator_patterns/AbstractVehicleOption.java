package com.coderwurst.decorator_patterns;

public abstract class AbstractVehicleOption extends AbstractVehicle {

	protected Vehicle decoratedVehicle;
	
	public AbstractVehicleOption(Vehicle vehicle) {
		super(vehicle.getEngine());
		this.decoratedVehicle = vehicle;
	}

}
