package com.coderwurst.chain_of_responsibility;

public class ManagerEmailHandler extends AbstractEmailHandler {

	private static String department = "*** Manager Handler ***";
	
	@Override
	protected String[] matchingWords() {
		return new String [] {"complain" , "bad" };
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by Manager");

	}
	
	public String getDepartment() {
		return department;
	}

}
