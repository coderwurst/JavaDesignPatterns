package com.coderwurst.strategy_pattern;

import com.coderwurst.design_patterns.Engine;

public interface GearboxStrategy {

	public void ensureCorrectGear(Engine engine, int speed);
}
