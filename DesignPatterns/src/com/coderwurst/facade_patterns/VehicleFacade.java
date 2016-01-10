package com.coderwurst.facade_patterns;

public class VehicleFacade {

	public void prepareForSale(Vehicle vehicle) {

		Registration reg = new Registration(vehicle);
		reg.allocateVehicleNumber();
		reg.allocateLicensePlate();
		
		Documentation.printBrochure(vehicle);
		
		vehicle.cleanExterior();
		vehicle.cleanInterior();
		vehicle.polishWindows();
		vehicle.takeForTestDrive();
		
	}

}
