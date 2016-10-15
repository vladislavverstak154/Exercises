package stationery_task3;

public class PaperStationery extends Stationery {
	private String name="paper";
	private int width;
	private int height;
	
	public PaperStationery(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		double price=width*height/619500;
		this.setPrice(price);
	}

	public PaperStationery(){
		super();
		this.width=210;
		this.height=295;
		this.setPrice(0.1);
	}
	
 }