package stationery_task4;

public class Pencil extends WritingStationery {
	{this.setName("Pencil");
	this.setInkType("graphite");}
	public Pencil(){
		this.setPrice(0.2);
		this.setInkColor("graphite");
	}
	public Pencil(String color, double price){
		this.setInkColor(color);
		this.setPrice(price);			
		}
}
