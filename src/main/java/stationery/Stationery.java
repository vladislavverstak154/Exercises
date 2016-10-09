package stationery;

/**
 * ����� ����������
 * 
 * @author vladislav
 *
 */
public class Stationery {

	private int price = 0;

	/**
	 * ������ ����������� ������� ��������� � ��������� �����
	 * 
	 * @param price
	 *            ������ �������� ������ ���� ���������� ����������
	 */
	protected Stationery(int price) {
		this.price = price;
	}

	/**
	 * ������ ����������� ������� ��������� � ������� ����������
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
