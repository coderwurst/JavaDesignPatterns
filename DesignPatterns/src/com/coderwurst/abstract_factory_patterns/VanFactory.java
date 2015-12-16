package com.coderwurst.abstract_factory_patterns;

public class VanFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		return new VanBody();
	}

	@Override
	public Chassis createChassis() {
		return new VanChassis();
	}

	@Override
	public Windows createWindows() {
		return new VanWindows();
	}

}
