package com.coderwurst.visitor_pattern;

public class SparkPlug implements Visitable {

	@Override
	public void acceptEngineVisitor(EngineVisitor visitor) {
		visitor.visit(this);
	}

}
