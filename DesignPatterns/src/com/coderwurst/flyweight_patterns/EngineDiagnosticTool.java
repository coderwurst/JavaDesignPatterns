package com.coderwurst.flyweight_patterns;

public class EngineDiagnosticTool implements DiagnosticTool {

	@Override
	public void runDiagnosis(Object obj) {
		System.out.println("Starting engine diagnostic tool for" + obj);
		
		try {
			Thread.sleep(5000);		// simulate some long running process
			System.out.println("Engine Diagnosis Complete");
		} catch (InterruptedException ex) {
			System.out.println("Engine diagnosis interrupted");
		}
		
	}

}
