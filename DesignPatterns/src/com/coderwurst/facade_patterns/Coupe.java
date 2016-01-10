package com.coderwurst.facade_patterns;

public class Coupe extends AbstractCar {

	public Coupe(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}

	public Coupe(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}

	public int getPrice() {
		return 7000;
	}

}
