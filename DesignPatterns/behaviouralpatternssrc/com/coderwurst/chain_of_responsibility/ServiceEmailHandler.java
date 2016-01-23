package com.coderwurst.chain_of_responsibility;

public class ServiceEmailHandler extends AbstractEmailHandler {

	private static String department = "*** Service Handler ***";
	
	@Override
	protected String[] matchingWords() {
		return new String [] {"service" , "repair" };
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by Service Dept");

	}

	@Override
	public String getDepartment() {
		return department;
	}

}
