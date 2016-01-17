package com.coderwurst.design_patterns;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public AbstractCar(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}

}
