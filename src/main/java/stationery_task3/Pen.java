package stationery_task3;

public class Pen extends WritingStationery {
	{this.setName("Pen");
	this.setInkType("ink");}
	public Pen(){
		this.setPrice(0.3);
		this.setInkColor("blue");
	}
	public Pen(String color, double price){
		this.setInkColor(color);
		this.setPrice(price);			
		}
}