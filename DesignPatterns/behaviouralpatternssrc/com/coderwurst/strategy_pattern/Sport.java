package com.coderwurst.strategy_pattern;

import com.coderwurst.design_patterns.Engine;
import com.coderwurst.design_patterns.Vehicle;

public class Sport extends AbstractCar {

	public Sport(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}

	public Sport(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
