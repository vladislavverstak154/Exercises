package stationery;

/**
 * ������ ����� ������������ ����� ���������
 * 
 * @author vladislav
 *
 */
public class Employee {
	Stationery[] kit;

	/**
	 * ������ ����������� ������� ������ ��������� � ����� ����������� c �������
	 * �����
	 */
	public Employee() {
		this.kit = new Stationery[1];
		this.kit[1] = new Stationery(0);
	}

	/**
	 * 
	 * ������ ����������� ������� ������ ��������� ��� ����� ������������ �
	 * ���������� ������
	 * 
	 * @param prices
	 *            ������ ��� ����������� ������� ���������
	 */
	public Employee(int... prices) {
		this.kit = new Stationery[prices.length];
		for (int i = 0; i < prices.length; i++) {
			this.kit[i] = new Stationery(prices[i]);
		}
	}
	/** 
	 * ������ ����� ��������� ��������� ��������� ���� ���������� � ����������� ���������
	 * @return
	 * ���������� �������� ��������� ��������� ���� ����������� � int
	 */
	public int getCost() {
		int cost = 0;
		for (int i = 0; i < kit.length; i++) {
			cost += this.kit[i].getPrice();
		}
		return cost;
	}
}
