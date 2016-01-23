package com.coderwurst.chain_of_responsibility;

public interface EmailHandler {
	
	public void setNextHandler(EmailHandler handler);
	public void processHandler(String email);
	
	public String getDepartment();

}
