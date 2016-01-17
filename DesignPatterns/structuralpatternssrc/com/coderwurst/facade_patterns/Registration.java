package com.coderwurst.facade_patterns;

public class Registration {

	private Vehicle vehicle;
	
	public Registration(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void allocateLicensePlate() {
		// TODO code
		System.out.println("License Plate allocated");
	}
	
	public void allocateVehicleNumber() {
		// TODO code
		System.out.println("Vehicle Number allocated");
	}

}
