package com.coderwurst.observer_patterns;

public class SpeedMonitorListener implements SpeedometerListener {

	public static final int SPEED_TO_ALERT = 70;

	@Override
	public void speedChanged(SpeedometerEvent event) {
		if (event.getSpeed() > SPEED_TO_ALERT){
			System.out.println("ALERT: Driving too fast!!! (" + event.getSpeed() + ")");
		} else {
			System.out.println("... slow and steady ... (" + event.getSpeed() + ")");
		}
		
	}
}
