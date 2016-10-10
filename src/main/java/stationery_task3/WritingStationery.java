package stationery_task3;

public class WritingStationery extends Stationery {
private String color;
private String inkType;
public WritingStationery(String name,int price,String inkType, String color){
	super(name, price);
	this.color=color;
	this.inkType=inkType;
}
protected String getColor() {
	return color;
}
protected void setColor(String color) {
	this.color = color;
}
protected String getInkType() {
	return inkType;
}
protected void setInkType(String inkType) {
	this.inkType = inkType;
}

}
