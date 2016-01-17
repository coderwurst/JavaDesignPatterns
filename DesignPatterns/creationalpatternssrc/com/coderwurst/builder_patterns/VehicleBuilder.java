package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.Vehicle;


public abstract class VehicleBuilder {
	
	public void buildBody() { }
	public void buildBoot() { }
	public void buildChassis() { }
	public void buildPassengerArea() { }
	public void buildReinforcedStorageArea() { }
	public void buildWindows() { }
	
	public abstract Vehicle getVehicle();

}
