package com.coderwurst.visitor_pattern;

public class EngineInventory implements EngineVisitor {

	private int camshaftCount;
	private int pistonCount;
	private int sparkPlugCount;

	public EngineInventory() {
		camshaftCount = 0;
		pistonCount = 0;
		sparkPlugCount = 0;
	}

	@Override
	public void visit(Camshaft camshaft) {
		camshaftCount++;
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("The Engine has: " + camshaftCount + " camshaft(s), " + pistonCount + " piston(s), "
				+ sparkPlugCount + " spark plug(s)");

	}

	@Override
	public void visit(Piston piston) {
		pistonCount++;
	}

	@Override
	public void visit(SparkPlug sparkPlug) {
		sparkPlugCount++;
	}

}
