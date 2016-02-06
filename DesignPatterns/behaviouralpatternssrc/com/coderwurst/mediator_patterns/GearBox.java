package com.coderwurst.mediator_patterns;

public class GearBox {

	public enum Gear {NEUTRAL, 
					FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH,
					REVERSE};
					
	private EngineManagementSystem mediator;
	private boolean enabled;
	private Gear currentGear;
	
	public GearBox (EngineManagementSystem mediator) {
		this.mediator = mediator;
		enabled = false;
		currentGear = Gear.NEUTRAL;
		mediator.registerGearBox(this);
	}
	
	public void enable() {
		enabled = true;
		mediator.gearBoxEnabled();
		System.out.println("Gear Box enabled");
	}
	
	public void disable() {
		enabled = false;
		mediator.gearBoxDisabled();
		System.out.println("Gear Box disabled");	
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setGear(Gear gear) {
		if(isEnabled() && (getGear() != gear)) {
			currentGear = gear;
			mediator.gearChanged();
			System.out.println("Now in " + getGear() + " gear");
		}
	}
	
	public Gear getGear() {
		return currentGear;
	}
}
