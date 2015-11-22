package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.*;


public class VanBuilder extends VehicleBuilder {

	private AbstractVan VanInProgress;
	
	public VanBuilder (AbstractVan Van) {
		VanInProgress = Van;
	}
	
	public void buildBody() {
		System.out.println("building Van body");
	}
	
	public void buildChassis() {
		System.out.println("building Van chassis");
	}
	
	public void buildWindows() {
		System.out.println("building Van windows");
	}
	
	public void buildReinforcedStorageArea() {
		System.out.println("building van Storage area");
	}
	
	@Override
	public Vehicle getVehicle() {
		return VanInProgress;
	}

}
