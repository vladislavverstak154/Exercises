package stationery_task3;

/**
 * Класс Канцотовар
 * 
 * @author vladislav
 *
 */
public class Stationery {
	
	private String name="stationery";
	private int price = 0;
	

	
	

	/**
	 * Данный конструктор создает канцтовар с нулевой стоимостью
	 * 
	 */
	public Stationery() {
	}
	
	/**
	 * Данный конструктор создает канцтовар с указанной ценой
	 * 
	 * @param price
	 *            данный параметр задает цену указанного канцтовара
	 */
	
	public Stationery(String name,int price) {
		this.price = price;
		this.name = name;
	}

	
	
	protected void setPrice(int price) {
		this.price = price;
	}

	protected int getPrice() {
		return price;
	}
	
	

}
