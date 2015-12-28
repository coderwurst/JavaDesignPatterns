package com.coderwurst.factory_method;

import com.coderwurst.design_patterns.BoxVan;
import com.coderwurst.design_patterns.Pickup;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;

public class VanFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		if (style == DrivingStyle.ECONOMICAL || style == DrivingStyle.MIDRANGE) {
			return new Pickup(new StandardEngine(2200));
		} else {
			return new BoxVan(new TurboEngine(2200));
		}
	}

}
