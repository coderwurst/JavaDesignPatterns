package com.coderwurst.memento_patterns.serializable;

import java.io.Serializable;

public class Speedometer implements Serializable {

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
	
	// only required for test purposes
	public int getPreviousSpeed() {
		return previousSpeed;
	}
}
