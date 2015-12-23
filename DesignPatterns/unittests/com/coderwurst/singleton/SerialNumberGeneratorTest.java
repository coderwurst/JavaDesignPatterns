package com.coderwurst.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SerialNumberGeneratorTest {	
	@Test
	public void testSerialNumGeneration() {
		int result = SerialNumberGenerator.INSTANCE.getNextSerial();
		int serial = 200000001;
		assertEquals(serial, result);
		
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();
		SerialNumberGenerator.INSTANCE.getNextSerial();

		result = SerialNumberGenerator.INSTANCE.getNextSerial();;
		serial = 200000010;
		assertEquals(serial, result);
		
		result = SerialNumberGenerator.VEHICLE.getNextSerial();
		serial = 200000001;
		assertEquals(serial, result);
		
		result = SerialNumberGenerator.ENGINE.getNextSerial();
		serial = 200000001;
		assertEquals(serial, result);
		
		SerialNumberGenerator.ENGINE.getNextSerial();
		
		result = SerialNumberGenerator.ENGINE.getNextSerial();
		serial = 200000003;
		assertEquals(serial, result);
		
	}

}
