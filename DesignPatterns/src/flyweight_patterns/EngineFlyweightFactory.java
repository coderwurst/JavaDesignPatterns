package flyweight_patterns;

import java.util.HashMap;
import java.util.Map;


public class EngineFlyweightFactory {

	private Map<Integer, Engine> standardEnginePool;
	private Map <Integer, Engine> turboEnginePool;
	
	public EngineFlyweightFactory() {
		standardEnginePool = new HashMap<Integer, Engine>();
		turboEnginePool = new HashMap<Integer, Engine>();
	}
	
	public Engine getStandardEngine (int size) {
		Engine e = standardEnginePool.get(size);
		if (e == null) {
			e = new StandardEngine (size);
			standardEnginePool.put(size, e);
		}
		return e;
	}
	
	public Engine getTurboEngine (int size) {
		Engine e = turboEnginePool.get(size);
		if (e == null) {
			e = new TurboEngine (size);
			turboEnginePool.put(size, e);
		}
		return e;
	}

}
