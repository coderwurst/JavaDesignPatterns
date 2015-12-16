package com.coderwurst.abstract_factory_patterns;

public class CarFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		return new CarBody();
	}

	@Override
	public Chassis createChassis() {
		return new CarChassis();
	}

	@Override
	public Windows createWindows() {
		return new CarWindows();
	}

}
