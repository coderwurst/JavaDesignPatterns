package com.coderwurst.creational_patterns;

public abstract class AbstractVehicleFactory {
	
	public abstract Body createBody();
	public abstract Chassis createChassis();
	public abstract Windows createWindows();

}
