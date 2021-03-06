package com.coderwurst.facade_patterns;

import com.coderwurst.facade_patterns.Engine;

public abstract class AbstractVehicle implements Vehicle {

	private Engine engine;
	private Vehicle.Colour colour;
	
	public AbstractVehicle (Engine engine) {
		this (engine, Vehicle.Colour.UNPAINTED);
	}
	
	public AbstractVehicle(Engine engine, Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}

	public void cleanInterior() {
		System.out.println("cleaning interior");
	}
	
	public void cleanExterior() {
		System.out.println("cleaning exterior");
	}
	
	public void polishWindows() {
		System.out.println("polishing windows");
	}
	
	public void takeForTestDrive() {
		System.out.println("taking for test drive");
	}
	
	@Override
	public Engine getEngine() {
		return engine;
	}

	@Override
	public Vehicle.Colour getColour() {
		return colour;
	}

	@Override
	public void paint(Colour colour) {
		this.colour = colour;
	}
	
	/*
	 * creates following output StandardEngine (0000 , COLOUR)
	 * 							TurboEngine (1111, COLOUR)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getClass().getSimpleName() + " (" + engine + ")" + "," + colour + ", " +
	"price " + getPrice() + ")";
	}

}
