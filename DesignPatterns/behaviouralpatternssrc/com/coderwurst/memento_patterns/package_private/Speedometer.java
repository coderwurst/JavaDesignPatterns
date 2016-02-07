package com.coderwurst.memento_patterns.package_private;

public class Speedometer {

	private int currentSpeed;
	
	int previousSpeed;
	
	public Speedometer() {
		currentSpeed = 0;
		previousSpeed = 0;
	}
	
	public void setCurrentSpeed (int speed) {
		previousSpeed = currentSpeed;
		currentSpeed = speed;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}
