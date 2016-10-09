package stationery;

/**
 * Класс Канцотовар
 * 
 * @author vladislav
 *
 */
public class Stationery {

	private int price = 0;

	/**
	 * Данный конструктор создает канцтовар с указанной ценой
	 * 
	 * @param price
	 *            данный параметр задает цену указанного канцтовара
	 */
	protected Stationery(int price) {
		this.price = price;
	}

	/**
	 * Данный конструктор создает канцтовар с нулевой стоимостью
	 * 
	 */
	protected Stationery() {
	};

	protected void setPrice(int price) {
		this.price = price;
	}

	protected int getPrice() {
		return price;
	}

}
