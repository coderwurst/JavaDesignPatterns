package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.Vehicle;


public abstract class VehicleDirector {
	
	public abstract Vehicle build(VehicleBuilder builder);

}
