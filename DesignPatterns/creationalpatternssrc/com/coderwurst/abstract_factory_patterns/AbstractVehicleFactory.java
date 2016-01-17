package com.coderwurst.abstract_factory_patterns;

public abstract class AbstractVehicleFactory {
	
	public abstract Body createBody();
	public abstract Chassis createChassis();
	public abstract Windows createWindows();

}
