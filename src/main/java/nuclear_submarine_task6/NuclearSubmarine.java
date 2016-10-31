package nuclear_submarine_task6;

public class NuclearSubmarine {
	EngineForNuclearSubmarine engine;

	NuclearSubmarine() {
		this.engine = new EngineForNuclearSubmarine();
	}
	
	void startEngine(){
		this.engine.start();
	}

	void go(){
		System.out.println("Go go go, We are live in the yellow submarine...");
	}
	
	public static void main(String[] args){
		NuclearSubmarine yellowSubmarine=new NuclearSubmarine();
		yellowSubmarine.startEngine();
		yellowSubmarine.go();
	}
	
	class EngineForNuclearSubmarine {
		void start() {
			System.out.println("Trrr Wrum Wrum");
		}
	}
}
