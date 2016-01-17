package flyweight_patterns;

public class Simulator {

	public static void main (String [] args) {
		
		EngineFlyweightFactory factory = new EngineFlyweightFactory();
		
		DiagnosticTool tool = new EngineDiagnosticTool();
		
		// all new engine sizes
		Engine engine1 = factory.getStandardEngine(1200);
		engine1.diagnose(tool);
		
		Engine engine2 = factory.getStandardEngine(1300);
		engine2.diagnose(tool);
		
		Engine engine3 = factory.getTurboEngine(1800);
		engine3.diagnose(tool);
		
		Engine engine4 = factory.getTurboEngine(2000);
		engine4.diagnose(tool);
		
		// repeats
		Engine engine5 = factory.getStandardEngine(1200);
		engine5.diagnose(tool);
		
		Engine engine6 = factory.getTurboEngine(2000);
		engine6.diagnose(tool);
		
		System.out.println("Objects in factory Pools");		
		System.out.println("Engine 1: " + engine1.hashCode() + ", compared to Engine 5: " + engine5.hashCode());
		System.out.println("Engine 2: " + engine2.hashCode());
		System.out.println("Engine 3: " + engine3.hashCode());
		System.out.println("Engine 4: " + engine4.hashCode() + ", compared to Engine 6: " + engine6.hashCode());
		System.out.println("Engine 5: " + engine5.hashCode());
		
	}

}
