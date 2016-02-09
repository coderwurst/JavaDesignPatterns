package com.coderwurst.visitor_pattern;

public interface Engine extends Visitable {

	public int getSize();
	public boolean isTurbo();
	
	public void acceptEngineVisitor (EngineVisitor engineVisitor);

}
