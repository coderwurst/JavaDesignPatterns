package com.coderwurst.strategy_pattern;

import com.coderwurst.decorator_patterns.AbstractVehicle;
import com.coderwurst.design_patterns.Engine;
import com.coderwurst.design_patterns.Vehicle;

public abstract class AbstractCar extends AbstractVehicle {

	private GearboxStrategy gearboxStrategy;
	
	public AbstractCar(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public AbstractCar(Engine engine, Vehicle.Colour colour) {
		super(engine);
		
		setGearBoxStrategy(new StandardGearboxStrategy());
	}

	public GearboxStrategy getGearBoxStrategy() {
		return gearboxStrategy;
	}

	public void setGearBoxStrategy(GearboxStrategy gearBoxStrategy) {
		this.gearboxStrategy = gearBoxStrategy;
	}
	
	public void setSpeed(int speed) {
		// delegate to strategy...
		gearboxStrategy.ensureCorrectGear(getEngine(), speed);
	}

}
