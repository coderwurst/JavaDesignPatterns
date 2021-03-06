package com.coderwurst.singleton_patterns;

public enum SerialNumberGenerator {
	
	// this is the singleton
	INSTANCE, ENGINE, VEHICLE;
	
	private int count = 200000000;
	
	// no need to worry about static members or a private constructor
	public synchronized int getNextSerial() {
		return ++count;
	}

}
