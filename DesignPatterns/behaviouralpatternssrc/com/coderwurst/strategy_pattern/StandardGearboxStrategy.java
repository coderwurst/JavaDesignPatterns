package com.coderwurst.strategy_pattern;

import com.coderwurst.design_patterns.Engine;

public class StandardGearboxStrategy implements GearboxStrategy {

	@Override
	public void ensureCorrectGear(Engine engine, int speed) {
		int engineSize = engine.getSize();
		boolean turbo = engine.isTurbo();

		// complicated code to determine gear comes here

		System.out.println("Working out correct gear at " + speed + " mph " + "for a STANDARD gearbox");

	}

}
