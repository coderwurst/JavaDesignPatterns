package com.coderwurst.observer_patterns;

import java.util.EventListener;

public interface SpeedometerListener extends EventListener {
	
	public void speedChanged(SpeedometerEvent event);

}
