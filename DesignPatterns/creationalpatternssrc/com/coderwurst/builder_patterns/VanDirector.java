package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.Vehicle;


public class VanDirector extends VehicleDirector {
	
	public Vehicle build(VehicleBuilder builder) {
		builder.buildChassis();
		builder.buildBody();
		builder.buildReinforcedStorageArea();
		builder.buildWindows();
		return builder.getVehicle();
	}

}
