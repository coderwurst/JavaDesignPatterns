package com.coderwurst.factory_method_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;
import com.coderwurst.factory_method.VanFactory;
import com.coderwurst.factory_method.VehicleFactory.DrivingStyle;

public class VanFactoryTest {
	private VanFactory instance = new VanFactory();
	private DrivingStyle style;
	private Vehicle result;
	private StandardEngine standardEngine;
	private TurboEngine turboEngine;
	
	@Test
	public void testEconomicalVan() {
		style = DrivingStyle.ECONOMICAL;
		result = instance.selectVehicle(style);
		
		standardEngine = new StandardEngine(2000);
		
		assertEquals(result.getEngine().getSize(), standardEngine.getSize());
		
	}
	
	@Test
	public void testMidrangeVan() {
		style = DrivingStyle.MIDRANGE;
		result = instance.selectVehicle(style);
		
		standardEngine = new StandardEngine(2000);
		
		assertEquals(result.getEngine().getSize(), standardEngine.getSize());
	}
	
	@Test
	public void testSportVan() {
		style = DrivingStyle.POWERFUL;
		result = instance.selectVehicle(style);
		
		turboEngine = new TurboEngine(2200);
		
		assertEquals(result.getEngine().getSize(), turboEngine.getSize());
	}

}
