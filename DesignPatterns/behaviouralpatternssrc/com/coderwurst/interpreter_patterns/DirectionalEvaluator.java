package com.coderwurst.interpreter_patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DirectionalEvaluator {
	
	private Map <String, City> cities;
	
	public DirectionalEvaluator () {
		cities = new HashMap <String, City> ();
		
		cities.put("aberdeen", new City("Aberdeen", 57.15, -2.15 ));
		cities.put("belfast", new City("Belfast", 54.62, -5.93 ));
		cities.put("birmingham", new City("Birmingham", 52.42, -1.92 ));
		cities.put("dublin", new City("Dublin", 53.33, -6.25 ));
		cities.put("edinburgh", new City("Edinburgh", 55.92, -3.02 ));
		cities.put("glasgow", new City("Glasgow", 55.83, -4.25 ));
		cities.put("london", new City("London", 51.53, -0.08 ));
		cities.put("liverpool", new City("Liverpool", 53.42, -3.0 ));
		cities.put("manchester", new City("Manchester", 53.5, -2.25 ));
		cities.put("southampton", new City("Southampton", 50.9, -1.38 ));
		
	}
	
	public City evaluate (String route) {
		
		Stack <Expression> expressionStack = new Stack <Expression> ();
		
		for (String token : route.split(" ")) {
			// first check for city names contained in the evaluator, if found, add to stack
			if (cities.containsKey(token)){
				City city = cities.get(token);
				expressionStack.push(new CityExpression(city));
			// then look for the key search words, if present push the current expression onto the stack
			} else if (token.equals("northerly")){
				expressionStack.push(new MostNortherlyExpression (loadExpressions(expressionStack)));
			} else if (token.equals("southerly")){
				expressionStack.push(new MostSoutherlyExpression (loadExpressions(expressionStack)));
			} else if (token.equals("easterly")){
				expressionStack.push(new MostEasterlyExpression (loadExpressions(expressionStack)));
			} else if (token.equals("westerly")){
				expressionStack.push(new MostWesterlyExpression (loadExpressions(expressionStack)));
			}
			/* the above if - else block would be ideally replaced with the use of the Chain Of responsibility
			 * patterned outlined previously... 
			 */
			
		}
		
		return expressionStack.pop().interpret();
	}
	
	private List <Expression> loadExpressions (Stack <Expression> expressionStack) {
		List <Expression> expressions = new ArrayList <Expression>();
		// new expression is added whilst the existing expressions are added back onto the stack
		while (! expressionStack.empty()) {
			expressions.add(expressionStack.pop());
		}
		return expressions;
	}

}
