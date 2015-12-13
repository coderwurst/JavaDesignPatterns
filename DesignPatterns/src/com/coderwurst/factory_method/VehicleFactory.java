package com.coderwurst.factory_method;

import com.coderwurst.design_patterns.Vehicle;

public abstract class VehicleFactory {
	
	public enum DrivingStyle { ECONOMICAL, MIDRANGE, POWERFUL };
	
	public Vehicle build (DrivingStyle style, Vehicle.Colour colour) {
		Vehicle v = selectVehicle(style);
		v.paint(colour);
		return v;
	}
	
	protected abstract Vehicle selectVehicle (DrivingStyle style);

}
