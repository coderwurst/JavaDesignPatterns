package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.*;


public class VanBuilder extends VehicleBuilder {

	private AbstractVan VanInProgress;
	
	public VanBuilder (AbstractVan Van) {
		VanInProgress = Van;
	}
	
	public void buildBody() {
		System.out.println("building van body");
	}
	
	public void buildChassis() {
		System.out.println("building van chassis");
	}
	
	public void buildWindows() {
		System.out.println("building van windows");
	}
	
	public void buildReinforcedStorageArea() {
		System.out.println("building van storage area");
	}
	
	@Override
	public Vehicle getVehicle() {
		return VanInProgress;
	}

}
