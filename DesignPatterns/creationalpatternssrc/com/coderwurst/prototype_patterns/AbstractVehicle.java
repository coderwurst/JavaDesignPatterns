package com.coderwurst.prototype_patterns;

public abstract class AbstractVehicle implements Vehicle {
	
	private Engine engine;
	private Vehicle.Colour colour;
	
	public AbstractVehicle (Engine engine) {
		this (engine, Vehicle.Colour.UNPAINTED);
	}
	
	public AbstractVehicle (Engine engine, Vehicle.Colour colour) {
		this.engine = engine;
		this.colour = colour;
		// more time consuming stuff here ...	
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Vehicle.Colour getColour() {
		return colour;
	}
	
	public void paint (Vehicle.Colour colour){
		this.colour= colour;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException x) {
			// should not happen ...
		}
		return obj;
	}
	
	public String toString() {
		return getClass().getSimpleName() + " (" + engine + ", " + colour + ")";
	}
	

}
