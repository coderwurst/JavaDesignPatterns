package com.coderwurst.state_patterns;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockSetup {
	
	private YearSetupState yearState;
	private MonthSetupState monthState;
	private DaySetupState dayState;
	private HourSetupState hourState;
	private MinuteSetupState minuteState;
	private FinishedSetupState finishedState;
	
	private ClockSetupState currentState;
	
	public ClockSetup() {
		yearState = new YearSetupState(this);
		monthState = new MonthSetupState(this);
		dayState = new DaySetupState(this);
		hourState = new HourSetupState(this);
		minuteState = new MinuteSetupState(this);
		finishedState = new FinishedSetupState(this);
		
		setState(yearState);
		
	}

	public void setState(ClockSetupState state) {
		currentState = state;
		System.out.println(currentState.getInstructions());		
	}
	
	public void rotateKnobLeft() {
		currentState.previousValue();
	}
	
	public void rotateKnobRight() {
		currentState.nextValue();
	}
	
	public void pushKnob() {
		currentState.selectValue();
	}
	
	public YearSetupState getYearSetupState() {
		return yearState;
	}

	public MonthSetupState getMonthSetupState() {
		return monthState;
	}

	public DaySetupState getDaySetupState() {
		return dayState;
	}

	public HourSetupState getHourSetupState() {
		return hourState;
	}

	public MinuteSetupState getMinuteSetupState() {
		return minuteState;
	}

	public FinishedSetupState getFinishedSetupState() {
		return finishedState;
	}

	public ClockSetupState getCurrentState() {
		return currentState;
	}
	
	public Calendar getSelectedDate() {
		return new GregorianCalendar(
				yearState.getSelectedValue(),
				monthState.getSelectedValue(), 
				dayState.getSelectedValue(), 
				hourState.getSelectedValue(),
				minuteState.getSelectedValue());
	}
}
