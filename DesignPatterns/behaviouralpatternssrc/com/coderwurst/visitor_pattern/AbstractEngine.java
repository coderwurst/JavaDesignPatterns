package com.coderwurst.visitor_pattern;

public abstract class AbstractEngine implements Engine {

	private int size;
	private boolean isTurbo;
	private Camshaft camshaft;
	private Piston piston;
	private SparkPlug [] sparkPlugs;

	public AbstractEngine(int size, boolean isTurbo) {
		this.size = size;
		this.isTurbo = isTurbo;
		
		this.camshaft = new Camshaft();
		this.piston = new Piston();
		this.sparkPlugs = new SparkPlug[] { new SparkPlug(), new SparkPlug(), new SparkPlug(), new SparkPlug()};
	}

	@Override
	public void acceptEngineVisitor (EngineVisitor visitor) {
		// visit each component
		camshaft.acceptEngineVisitor(visitor);
		piston.acceptEngineVisitor(visitor);
		for(SparkPlug eachSparkPlug : sparkPlugs) {
			eachSparkPlug.acceptEngineVisitor(visitor);
		}
	
		// and then the receiver
		visitor.visit(this);

	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isTurbo() {
		return isTurbo;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" + size + ")";
	}

}
