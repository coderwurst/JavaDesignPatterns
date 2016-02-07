package com.coderwurst.observer_patterns;

import java.util.ArrayList;
import java.util.List;

public class SpeedometerWithEventsListeners {

	private int currentSpeed;
	private List <SpeedometerListener> listeners;
	
	
	public SpeedometerWithEventsListeners() {
		currentSpeed = 0;
		listeners = new ArrayList <SpeedometerListener> ();
	}
	
	public void setCurrentSpeed (int speed) {
		currentSpeed = speed;
		
		// inform all observers
		fireSpeedChanged();
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void addSpeedometerListener (SpeedometerListener obj) {
		listeners.add(obj);
	}
	
	public void removeSpeedometerListener (SpeedometerListener obj) {
		listeners.remove(obj);
	}
	
	public void fireSpeedChanged() {
		SpeedometerEvent speedEvent = new SpeedometerEvent (this, getCurrentSpeed());
		
		for (SpeedometerListener eachListener : listeners) {
			eachListener.speedChanged(speedEvent);
		}
		
	}
	
}
