package stationery_task3;

/**
 * Class Stationery
 * 
 * @author vladislav
 *
 */
public abstract class Stationery {
	
	private String name;
	private double price;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		
	public String sortByName(){
		return this.name;
	}
	
}
