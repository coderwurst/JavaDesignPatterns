package com.coderwurst.chainofresponsibility;

public class ManagerEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String [] {"complain" , "bad" };
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by Manager");

	}

}
