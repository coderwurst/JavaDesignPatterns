package com.coderwurst.interpreter_patterns;

import java.util.List;

public class MostNortherlyExpression implements Expression {

	private List <Expression> expressions;
	
	public MostNortherlyExpression (List <Expression> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public City interpret() {
		// default city object starting as far away from north as possible
		City resultingCity = new City ("Nowhere", -999.9, -999.9);
		// loops through the city expressions and compares location
		for (Expression currentExpression : expressions) {
			City currentCity = currentExpression.interpret();
			// the most northerly city is added to the resulting city each time
			if (currentCity.getLatitude() > resultingCity.getLatitude()) {
				resultingCity = currentCity;
			}
		}
		return resultingCity;
	}

}
