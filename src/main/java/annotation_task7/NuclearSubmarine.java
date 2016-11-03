package annotation_task7;
/**
 * 
 * NuclearSubmarine
 *
 */
@Service(name="Submarine")
public class NuclearSubmarine {
	EngineForNuclearSubmarine engine;
	private boolean isEngineStart=false;
	
	NuclearSubmarine() {
		this.engine = new EngineForNuclearSubmarine();
	}
	@Init(name="Starter")
	void startEngine(){
		this.engine.start();
		this.isEngineStart=true;
	}
	@Init(name="Turn pedal")
	void go(){
		if(this.isEngineStart){
			System.out.println("Go go go, We are live in the yellow submarine...");	
		}
		else{System.out.println("Turn engine first");
	}
	}
	
	/**public static void main(String[] args){
		NuclearSubmarine yellowSubmarine=new NuclearSubmarine();
		yellowSubmarine.startEngine();
		yellowSubmarine.go();
	}
	*/
	
	class EngineForNuclearSubmarine {
		void start() {
			System.out.println("Trrr Wrum Wrum");
		}
	}
}

