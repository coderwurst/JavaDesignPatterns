package com.coderwurst.bridge_patterns;

public interface Engine {

	public int getSize();
	public boolean isTurbo();
	
	public void start();
	public void stop();
	public void increasePower();
	public void decreasePower();
}
