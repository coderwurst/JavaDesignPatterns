package com.coderwurst.factory_method;

import com.coderwurst.design_patterns.Coupe;
import com.coderwurst.design_patterns.Saloon;
import com.coderwurst.design_patterns.Sport;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle selectVehicle(DrivingStyle style) {
		if (style == DrivingStyle.ECONOMICAL) {
			return new Saloon (new StandardEngine(1300));
		} else if (style == DrivingStyle.MIDRANGE) {
			return new Coupe (new StandardEngine(1600));
		} else {
			return new Sport (new TurboEngine(2000));
		}
	}

}
