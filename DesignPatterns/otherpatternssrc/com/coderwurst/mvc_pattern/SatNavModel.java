package com.coderwurst.mvc_pattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class SatNavModel implements Serializable {

	private static final long serialVersionUID = -4805193146702485635L;

	public static final String DIRECTION_CHANGE = "direction";
	public static final String SPEED_CHANGE = "speed";

	public enum Direction {
		NORTH, SOUTH, EAST, WEST
	};

	private Direction currentDirection;
	private int currentSpeed;

	private PropertyChangeSupport changeSupport;

	public SatNavModel() {
		currentDirection = Direction.NORTH;
		currentSpeed = 0;
		changeSupport = new PropertyChangeSupport(this);
	}

	public void setDirection(Direction newDirection) {
		if (newDirection != currentDirection) {
			Direction previousDirection = currentDirection;
			currentDirection = newDirection;
			changeSupport.firePropertyChange(DIRECTION_CHANGE, previousDirection, currentDirection);
		}
	}

	public Direction getDirection() {
		return currentDirection;
	}
	
	public void setSpeed (int newSpeed) {
		if (newSpeed != currentSpeed) {
			int previousSpeed = currentSpeed;
			currentSpeed = newSpeed;
			changeSupport.firePropertyChange(DIRECTION_CHANGE, previousSpeed, currentDirection);
		}
	}
	
	public int getSpeed() {
		return currentSpeed;
	}
	
	// property support listener found in java.beans package
	// this is the link to the other classes
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		changeSupport.addPropertyChangeListener(pcl);
	}
	
	public void removeChangeListener(PropertyChangeListener pcl) {
		changeSupport.removePropertyChangeListener(pcl);
	}

}
