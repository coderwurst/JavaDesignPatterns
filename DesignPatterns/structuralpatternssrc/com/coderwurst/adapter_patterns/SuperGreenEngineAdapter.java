package com.coderwurst.adapter_patterns;

import com.coderwurst.design_patterns.AbstractEngine;

public class SuperGreenEngineAdapter extends AbstractEngine {
	
	public SuperGreenEngineAdapter (SuperGreenEngine greenEngine) {
		super(greenEngine.getEngineSize(), false);
	}

}
