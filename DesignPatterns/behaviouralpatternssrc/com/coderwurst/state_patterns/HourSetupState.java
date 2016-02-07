package com.coderwurst.state_patterns;

import java.util.Calendar;

public class HourSetupState implements ClockSetupState {

	private ClockSetup clockSetup;
	private int hour;
	
	public HourSetupState(ClockSetup clockSetup) {
		this.clockSetup = clockSetup;
		hour = Calendar.getInstance().get(Calendar.HOUR);
		
	}
	
	@Override
	public void previousValue() {
		if(hour > 0) {
			hour--;
		}
	}

	@Override
	public void nextValue() {
		if (hour < 23) {
			hour++;
		}
	}

	@Override
	public void selectValue() {
		System.out.println("Hour set to " + hour);
		// contains next step to Month setup
		clockSetup.setState(clockSetup.getMinuteSetupState());
	}

	@Override
	public String getInstructions() {
		return "please select the hour";
	}

	@Override
	public int getSelectedValue() {
		return hour;
	}
}
