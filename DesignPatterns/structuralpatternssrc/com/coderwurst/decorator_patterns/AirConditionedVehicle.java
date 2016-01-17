package com.coderwurst.decorator_patterns;

public class AirConditionedVehicle extends AbstractVehicleOption {

	private int temperature;
	
	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
		this.temperature = 18;
	}
	
	public int getPrice() {
		return decoratedVehicle.getPrice() + 600;
	}
	
	public void setTemperature (int value) {
		this.temperature += value;
	}
	
	public int getTemperature() {
		return temperature;
	}

}
