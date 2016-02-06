package com.coderwurst.mediator_patterns;

public class Simulator {

	public static void main (String [] args) {
		
		
		EngineManagementSystem car = new EngineManagementSystem();
		Ignition igition = new Ignition(car);
		GearBox gearbox = new GearBox(car);
		Accelerator accelerator = new Accelerator(car);
		Brakes brakes = new Brakes(car);
		
		car.ignitionTurnedOn();
		car.acceleratorPressed();
		car.acceleratorPressed();
		car.acceleratorPressed();
		car.brakePressed();
	}
	
}
