package com.coderwurst.design_patterns;

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
		return getClass().getSimpleName() + " (" + engine + ")" + "," + colour + ")";
	}

}
