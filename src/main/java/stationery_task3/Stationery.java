package stationery_task3;

/**
 * ����� ����������
 * 
 * @author vladislav
 *
 */
public class Stationery {
	
	private String name="stationery";
	private int price = 0;
	

	
	

	/**
	 * ������ ����������� ������� ��������� � ������� ����������
	 * 
	 */
	public Stationery() {
	}
	
	/**
	 * ������ ����������� ������� ��������� � ��������� �����
	 * 
	 * @param price
	 *            ������ �������� ������ ���� ���������� ����������
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
