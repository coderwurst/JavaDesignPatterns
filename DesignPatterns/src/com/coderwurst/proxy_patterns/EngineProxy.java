package com.coderwurst.proxy_patterns;

public class EngineProxy implements Engine {

	private Engine engine;
	
	public EngineProxy(int size, boolean isTurbo) {
		if (isTurbo) {
			engine = new TurboEngine(size);
		} else {
			engine = new StandardEngine(size);
		}
	}

	@Override
	public int getSize() {
		return engine.getSize();
	}

	@Override
	public boolean isTurbo() {
		return engine.isTurbo();
	}

	@Override
	public void diagnose(final DiagnosticTool tool) {
		// this time method run on separate thread
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running diagnostic tool as thread");
				engine.diagnose(tool);
			}
		});
		thread.start();
		System.out.println("EngineProxy diagnose method finished");
		
	}

}
