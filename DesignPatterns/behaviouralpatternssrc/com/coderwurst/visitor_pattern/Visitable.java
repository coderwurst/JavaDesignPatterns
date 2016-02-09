package com.coderwurst.visitor_pattern;

public interface Visitable {
	
	public void acceptEngineVisitor (EngineVisitor visitor);
	
}
