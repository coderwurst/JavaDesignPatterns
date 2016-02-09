package com.coderwurst.visitor_pattern;

public class Simulator {

	public static void main(String[] args) {

		Engine engine = new StandardEngine(2000);
		
		engine.acceptEngineVisitor(new EngineDiagnostics());
		
		engine.acceptEngineVisitor(new EngineInventory());
		
	}

}
