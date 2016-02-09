package com.coderwurst.visitor_pattern;

public class Camshaft implements Visitable {

	@Override
	public void acceptEngineVisitor(EngineVisitor visitor) {
		visitor.visit(this);
	}

}
