package com.coderwurst.state_patterns;

public interface ClockSetupState {

	// methods for handling changes to the state
	public void previousValue();
	public void nextValue();
	public void selectValue();
	
	// methods for handling user instructions and return the selected value
	public String getInstructions();
	public int getSelectedValue();
	
}
