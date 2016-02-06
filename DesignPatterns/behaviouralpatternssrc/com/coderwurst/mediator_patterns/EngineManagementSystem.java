package com.coderwurst.mediator_patterns;

public class EngineManagementSystem {

	private Ignition ignition;
	private Accelerator accelerator;
	private GearBox gearBox;
	private Brakes brakes;
	
	private int currentSpeed;
	
	public EngineManagementSystem() {
		currentSpeed = 0;
	}
	
	public void registerGearBox(GearBox gearBox) {
		this.gearBox = gearBox;		
	}
	
	public void registerAccelerator(Accelerator accelerator) {
		this.accelerator = accelerator;		
	}
	
	public void registerIgnition(Ignition ignition) {
		this.ignition = ignition;		
	}
	
	public void registerBrakes(Brakes brakes) {
		this.brakes = brakes;
	}
	

	public void ignitionTurnedOn() {
		gearBox.enable();
		accelerator.enable();
		brakes.enable();
		
	}

	public void ignitionTurnedOff() {
		gearBox.disable();
		accelerator.disable();
		brakes.disable();
	}

	

	public void gearBoxEnabled() {
		System.out.println("EMS now in control of gears");
	}

	public void gearBoxDisabled() {
		System.out.println("EMS now no longer in control of brakes");
	}

	public void gearChanged() {
		System.out.println("EMS disengaging clutch for gear change");
	}

	

	public void brakePressed() {
		accelerator.disable();
		currentSpeed = 0;
		
	}

	public void brakesDisabled() {
		System.out.println("EMS now no longer in control of brakes");		
	}

	public void brakesEnabled() {
		System.out.println("EMS now in control of brakes");
	}

	public void brakesReleased() {
		gearBox.setGear(GearBox.Gear.FIRST);
		accelerator.enable();
	}
	

	public void acceleratorEnabled() {
		System.out.println("EMS now in control of acceleration");
		
	}

	public void acceleratorDisabled() {
		System.out.println("EMS now no longer in control of acceleration");
	}

	public void acceleratorPressed() {
		brakes.disable();
		while (currentSpeed < accelerator.getSpeed()) {
			
			currentSpeed++;
			System.out.println("Speed currently " + currentSpeed);
		}
		
		// set gear based on speed
		if (currentSpeed <=10) {
			gearBox.setGear(GearBox.Gear.FIRST);
		} else if (currentSpeed <= 20) {
			gearBox.setGear(GearBox.Gear.SECOND);
		} else if (currentSpeed <= 30) {
			gearBox.setGear(GearBox.Gear.THIRD);
		} else if (currentSpeed <= 50) {
			gearBox.setGear(GearBox.Gear.FOURTH);
		} else if (currentSpeed <= 60) {
			gearBox.setGear(GearBox.Gear.FIFTH);	
		} else {
			gearBox.setGear(GearBox.Gear.SIXTH);
		}
		
		brakes.enable();
		
	}

}
