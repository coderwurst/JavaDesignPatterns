package com.coderwurst.observer_patterns;

import java.util.EventObject;

@SuppressWarnings("serial")
public class SpeedometerEvent extends EventObject {

	private int speed;
	
	public SpeedometerEvent(Object source, int speed) {
		super(source);
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

}
