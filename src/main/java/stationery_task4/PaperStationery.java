package stationery_task4;

public class PaperStationery extends Stationery {
	private int width;
	private int height;
	
	public PaperStationery(int width, int height) {
		super();
		super.setName("Paper");
		this.width = width;
		this.height = height;
		double price=width*height/619500;
		this.setPrice(price);
	}

	public PaperStationery(){
		super();
		super.setName("Paper");
		this.width=210;
		this.height=295;
		this.setPrice(0.1);
	}
	
 }