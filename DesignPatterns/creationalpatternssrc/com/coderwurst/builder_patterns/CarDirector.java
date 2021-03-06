package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.Vehicle;


public class CarDirector extends VehicleDirector {
	
	public Vehicle build(VehicleBuilder builder) {
		builder.buildChassis();
		builder.buildBody();
		builder.buildPassengerArea();
		builder.buildBoot();
		builder.buildWindows();
		return builder.getVehicle();
	}

}
