package com.coderwurst.chain_of_responsibility;

public class GeneralEnquiriesEmailHandler extends AbstractEmailHandler {

	private static String department = "*** General Enquiries Handler ***";
	
	@Override
	protected String[] matchingWords() {
		return new String [0];		// anything
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by General Enquiries");

	}

	@Override
	public String getDepartment() {
		return department;
	}

}
