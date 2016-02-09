package com.coderwurst.visitor_pattern;

public interface EngineVisitor {
	
	public void visit(Camshaft camshaft);
	public void visit(Engine engine);
	public void visit(Piston piston);
	public void visit(SparkPlug sparkPlug);	

}
