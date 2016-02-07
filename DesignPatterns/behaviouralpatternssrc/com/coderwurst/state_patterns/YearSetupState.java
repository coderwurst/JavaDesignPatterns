package com.coderwurst.state_patterns;

import java.util.Calendar;

public class YearSetupState implements ClockSetupState {

	private ClockSetup clockSetup;
	private int year;
	
	public YearSetupState(ClockSetup clockSetup) {
		this.clockSetup = clockSetup;
		year = Calendar.getInstance().get(Calendar.YEAR);
		
	}
	
	@Override
	public void previousValue() {
		year--;

	}

	@Override
	public void nextValue() {
		year++;

	}

	@Override
	public void selectValue() {
		System.out.println("Year set to " + year);
		// contains next step to Month setup
		clockSetup.setState(clockSetup.getMonthSetupState());
	}

	@Override
	public String getInstructions() {
		return "please select the year";
	}

	@Override
	public int getSelectedValue() {
		return year;
	}

}
