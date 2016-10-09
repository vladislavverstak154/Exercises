package stationery;

/**
 * Данный класс представляет собой Работника
 * 
 * @author vladislav
 *
 */
public class Employee {
	Stationery[] kit;

	/**
	 * Данный конструктор создает объект работника с одним канцтоваром c нулевой
	 * ценой
	 */
	public Employee() {
		this.kit = new Stationery[1];
		this.kit[1] = new Stationery(0);
	}

	/**
	 * 
	 * Данный конструктор саздает объект работника его набор канцотоваров с
	 * указанными ценами
	 * 
	 * @param prices
	 *            массив цен канцтоваров данного работника
	 */
	public Employee(int... prices) {
		this.kit = new Stationery[prices.length];
		for (int i = 0; i < prices.length; i++) {
			this.kit[i] = new Stationery(prices[i]);
		}
	}
	/** 
	 * Данный метод позволяет вычислить стоимость всех канцтоваов у конкретного работника
	 * @return
	 * возвращает значение суммарной стоимости всех канцтоваров в int
	 */
	public int getCost() {
		int cost = 0;
		for (int i = 0; i < kit.length; i++) {
			cost += this.kit[i].getPrice();
		}
		return cost;
	}
}
