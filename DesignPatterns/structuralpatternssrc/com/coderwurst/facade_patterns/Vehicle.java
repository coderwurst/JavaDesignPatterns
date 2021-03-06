package com.coderwurst.facade_patterns;

import com.coderwurst.facade_patterns.Engine;

public interface Vehicle {
	
	public enum Colour { UNPAINTED, BLUE, BLACK, GREEN, 
						 RED, SILVER, WHITE, YELLOW };
						 
	public Engine getEngine();
	public Vehicle.Colour getColour();
	public void paint(Vehicle.Colour colour);
	public int getPrice();
	
	public void cleanExterior();
	public void cleanInterior();
	public void polishWindows();
	public void takeForTestDrive();

}
