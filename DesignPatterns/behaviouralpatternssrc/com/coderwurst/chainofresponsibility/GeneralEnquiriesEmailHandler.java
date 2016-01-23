package com.coderwurst.chainofresponsibility;

public class GeneralEnquiriesEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String [0];		// anything
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by General Enquiries");

	}

}
