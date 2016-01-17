package com.coderwurst.proxy_patterns;

public class Simulator {

	public static void main (String [] args) {
		
		DiagnosticTool tool = new EngineDiagnosticTool();
		
		Engine engine1 = new EngineProxy(1200, false);
		engine1.diagnose(tool);
		Engine engine2 = new EngineProxy(2000, true);
		engine2.diagnose(tool);
		Engine engine3 = new EngineProxy(1400, true);
		engine3.diagnose(tool);
		Engine engine4 = new EngineProxy(1400, false);
		engine4.diagnose(tool);		
	}

}
