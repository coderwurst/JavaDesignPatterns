package com.coderwurst.observer_patterns;

import java.util.Observable;

public class Speedometer extends Observable {

	private int currentSpeed;
	
	
	public Speedometer() {
		currentSpeed = 0;
	}
	
	public void setCurrentSpeed (int speed) {
		currentSpeed = speed;
		
		// inform all observers that something has changed
		setChanged();		// changed set to true
		notifyObservers();	// alerts observers that something has changed
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}
