package com.coderwurst.observer_patterns;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {

	public static final int SPEED_TO_ALERT = 70;
	
	@Override
	public void update(Observable o, Object arg) {
		Speedometer speedo = (Speedometer) o;
		if (speedo.getCurrentSpeed() > SPEED_TO_ALERT) {
			System.out.println("ALERT: Driving too fast!!! (" + speedo.getCurrentSpeed() + ")");
		} else {
			System.out.println("... slow and steady ... (" + speedo.getCurrentSpeed() + ")");
		}
	}
}
