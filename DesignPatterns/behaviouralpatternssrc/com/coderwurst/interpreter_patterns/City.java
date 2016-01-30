package com.coderwurst.interpreter_patterns;

public class City {
	
	private String name;
	private double latitude, longitude;
	
	public City(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;		// positive values represent north, negative south
		this.longitude = longitude;		// positive values represent east, negative west
	}

	public String getName() {
		return name;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	public boolean equals (Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		
		if (!(otherObject instanceof City)) {
			return false;
		}
		
		City otherCity = (City) otherObject;
		
		return getName().equals(otherCity.getName());
	}
	
	public int hashCode() {
		return getName().hashCode();
	}
	
	public String toString() {
		return name.toString();
	}

}
