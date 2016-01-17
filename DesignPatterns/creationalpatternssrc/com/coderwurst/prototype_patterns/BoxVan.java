package com.coderwurst.prototype_patterns;

public class BoxVan extends AbstractVan {

	public BoxVan(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}

	public BoxVan(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}

}
