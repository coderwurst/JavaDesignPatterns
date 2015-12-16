package com.coderwurst.abstract_factory_patterns;


public class Simulator {

	public static void main(String[] args) {

		String whatToMake = "car";		// or van
		
		AbstractVehicleFactory factory = null;
		
		if (whatToMake.equals("car")) {
			factory = new CarFactory();
		} else {
			factory = new VanFactory();
		}
		
		Body vehicleBody = factory.createBody();
		Chassis vehicleChassis = factory.createChassis();
		Windows vehicleWindows = factory.createWindows();
		
		System.out.println(vehicleBody.getBodyParts());
		System.out.println(vehicleChassis.getChassisParts());
		System.out.println(vehicleWindows.getWindowParts());	
		
	}

}
