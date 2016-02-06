package com.coderwurst.mediator_patterns;

public class Brakes {
	
	private EngineManagementSystem mediator;
	private boolean enabled;
	private boolean applied;
	
	public Brakes (EngineManagementSystem mediator) {
		this.mediator = mediator;
		enabled = false;
		applied = false;
		mediator.registerBrakes(this);
	}
	
	public void enable() {
		enabled = true;
		mediator.brakesEnabled();
		System.out.println("Brakes enabled");
	}
	
	public void disable() {
		enabled = false;
		mediator.brakesDisabled();
		System.out.println("Brakes disabled");	
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void apply() {
		if(isEnabled()) {
			applied = true;
			mediator.brakePressed();
			System.out.println("Now breaking");
		}
	}
	
	public void release() {
		if (isEnabled()){ 
			applied = false;
			mediator.brakesReleased();
			System.out.println("Brake released");
		}
	}
}
