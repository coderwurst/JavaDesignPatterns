package com.coderwurst.visitor_pattern;

public class EngineDiagnostics implements EngineVisitor {

	@Override
	public void visit(Camshaft camshaft) {
		System.out.println("Diagnosing Camshaft");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Diagnosing Engine Unit");
	}

	@Override
	public void visit(Piston piston) {
		System.out.println("Diagnosing Piston");
	}

	@Override
	public void visit(SparkPlug sparkPlug) {
		System.out.println("Diagnosing a single Spark Plug");
	}

}
