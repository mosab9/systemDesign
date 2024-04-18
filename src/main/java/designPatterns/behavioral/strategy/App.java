package designPatterns.behavioral.strategy;

public class App {

	public static void main(String[] args) {
		
		OperationManagerBAD manager = new OperationManagerBAD();
		manager.execute(new Multiplication(), 10, 5);


		OperationManager manager2 = new OperationManager();
		manager2.setStrategy(new Multiplication());
		manager2.execute( 10, 5);
		
	}
}
