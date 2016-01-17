package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.*;

public class CarBuilder extends VehicleBuilder {

	private AbstractCar carInProgress;
	
	public CarBuilder (AbstractCar car) {
		carInProgress = car;
	}
	
	public void buildBody() {
		System.out.println("building car body");
	}
	
	public void buildBoot() {
		System.out.println("building car boot");
	}
	
	public void buildChassis() {
		System.out.println("building car chassis");
	}
	
	public void buildPassengerArea() {
		System.out.println("building car passenger area");
	}
	
	public void buildWindows() {
		System.out.println("building car windows");
	}
	
	@Override
	public Vehicle getVehicle() {
		return carInProgress;
	}

}
