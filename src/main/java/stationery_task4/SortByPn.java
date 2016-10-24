package stationery_task4;

import java.util.Comparator;

public class SortByPn implements Comparator<Stationery> {
	
	public int compare(Stationery stnr1, Stationery stnr2) {
		int i=0;
		if (stnr1.getPrice() < stnr2.getPrice()) {
			i = -1;
		} else if (stnr1.getPrice() > stnr2.getPrice()) {
			i = 0;
		} else if (stnr1.getPrice() == stnr2.getPrice()) {
			i=this.compareName(stnr1,stnr2);
		}
		return i;
	}
	
	private int compareName(Stationery stnr1, Stationery stnr2) {
		int i = 0;
		if(this.nameRank(stnr1)==this.nameRank(stnr2)){
			i=0;
		}
		else if(this.nameRank(stnr1)>this.nameRank(stnr2)){
			i=1;
		}
		else if(this.nameRank(stnr1)<this.nameRank(stnr2)){
			i=-1;}
		return i;
	}
	
	private int nameRank(Stationery stnr){
		int i=0;
		if(stnr.getName().equals("Pen")){i=3;}
		else if(stnr.getName().equals("Pencil")){i=2;}
		else if(stnr.getName().equals("Paper")){i=3;}
		else {System.out.println("Invalid comparable types");}
		return i;
			}

}
