package stationery_task4;

/**
 * Class Stationery
 * 
 * @author vladislav
 *
 */
public class Stationery {
	
	private String name;
	private double price;
	
		
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

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
