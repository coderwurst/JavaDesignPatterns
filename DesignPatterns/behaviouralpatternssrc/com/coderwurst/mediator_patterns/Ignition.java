package com.coderwurst.mediator_patterns;

public class Ignition {

	private EngineManagementSystem mediator;
	private boolean isOn;
	
	// establishes 2 way comms
	public Ignition (EngineManagementSystem mediator) {
		this.mediator = mediator;
		this.isOn = false;
		
		// important to register back to the mediator
		mediator.registerIgnition(this);
	}
	
	// updates object and notifies mediator
	public void start() {
		isOn = true;
		mediator.ignitionTurnedOn();
		System.out.println("Ignition turned on");
	}
	
	// updates object and notifies mediator
	public void stop() {
		isOn = false;
		mediator.ignitionTurnedOff();
		System.out.println("Ignition turned off");
	}
	
	public boolean isOn() {
		return isOn;
	}
}
