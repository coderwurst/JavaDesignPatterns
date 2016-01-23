package com.coderwurst.chainofresponsibility;

public class SpamEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String [] {"viagra" , "pills" , "medicins" };
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("<---- SPAM ---->");

	}

}
