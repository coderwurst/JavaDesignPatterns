package com.coderwurst.chain_of_responsibility;

public class SpamEmailHandler extends AbstractEmailHandler {

	private static String department = "*** Spam Handler ***";
	
	@Override
	protected String[] matchingWords() {
		return new String [] {"viagra" , "pills" , "medicins" };
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("<---- SPAM ---->");

	}

	@Override
	public String getDepartment() {
		return department;
	}

}
