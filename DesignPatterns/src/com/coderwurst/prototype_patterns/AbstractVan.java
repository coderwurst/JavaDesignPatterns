package com.coderwurst.prototype_patterns;

public abstract class AbstractVan extends AbstractVehicle {

	public AbstractVan(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public AbstractVan(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}

}
