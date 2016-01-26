package com.coderwurst.command_patterns;

public class Radio {

	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 10;
	public static final int DEFAULT_VOLUME = 5;
	
	private boolean on;
	private int volume;
	
	public Radio() {
		on = false;
		volume = DEFAULT_VOLUME;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void on() {
		on = true;
		System.out.println("Radio now on, volume level " + getVolume());
	}
	
	public void off() {
		on = false;
		System.out.println("Radio now off");
	}
	
	public void volumeUp() {
		if (isOn()){
			if (volume < MAX_VOLUME) {
				volume++;
				System.out.println("Volume increased to " + getVolume());
			} else {
				System.out.println("Max Volume reached");
			}
		}
	}
	
	public void volumeDown() {
		if (isOn()){
			if(volume > MIN_VOLUME){
				volume--;
				System.out.println("Volume decreased to " + getVolume());
			} else {
				System.out.println("Min Volume reached");
			}
		}
	}
	
	// further code needed to set and adjust frequency
}
