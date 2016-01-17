package com.coderwurst.proxy_patterns;

public interface Engine {

	// intrinsic (shared)
	public int getSize();
	public boolean isTurbo();
	
	// extrinsic (unshared)
	public void diagnose(DiagnosticTool tool);
}
