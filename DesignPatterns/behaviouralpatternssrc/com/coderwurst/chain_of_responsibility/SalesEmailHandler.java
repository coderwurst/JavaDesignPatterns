package com.coderwurst.chain_of_responsibility;

public class SalesEmailHandler extends AbstractEmailHandler {

	private static String department = "*** Sales Handler ***";
	
	@Override
	protected String[] matchingWords() {
		return new String [] {"buy" , "purchase"};
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by Sales Dept");

	}

	@Override
	public String getDepartment() {
		return department;
	}

}
