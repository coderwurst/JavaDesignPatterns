package com.coderwurst.interpreter_patterns;

public class CityExpression implements Expression {

	private City city;
	
	public CityExpression (City city) {
		this.city = city;
	}
	
	@Override
	public City interpret() {
		return city;
	}

}
