package com.coderwurst.memento_patterns.package_private;

public class SpeedometerMemento {
	
	private Speedometer speedometer;
	
	private int copyOfCurrentSpeed;
	private int copyOfPreviousSpeed;
	
	public SpeedometerMemento (Speedometer speedometer) {
		this.speedometer = speedometer;
		copyOfCurrentSpeed = speedometer.getCurrentSpeed();
		// only possible because of package access
		copyOfPreviousSpeed = speedometer.previousSpeed;
	}
	
	public void restoreState() {
		speedometer.setCurrentSpeed(copyOfCurrentSpeed);
		speedometer.previousSpeed = copyOfPreviousSpeed;
	}

}
