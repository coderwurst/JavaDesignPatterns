package com.coderwurst.chainofresponsibility;

public interface EmailHandler {
	
	public void setNextHandler(EmailHandler handler);
	public void processHandler(String email);

}
