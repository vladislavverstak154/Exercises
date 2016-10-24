package stationery_task4;

import java.util.Arrays;

//Necomer's Kit

public class NcKit {
	Stationery[] kit = new Stationery[8];

	public NcKit() {
		kit[0] = new Pen("red", 0.3);
		kit[1] = new Pen("black", 0.35);
		kit[2] = new Pen();
		kit[3] = new Pencil();
		kit[4] = new Pencil("green", 0.2);
		kit[5] = new PaperStationery(420, 550);
		kit[6] = new PaperStationery(840, 1100);
		kit[7] = new PaperStationery();
	}

	public void sortByPrice(){
		SortByPrice sort=new SortByPrice();
		Arrays.sort(this.kit,sort);}
	
	public void sortByName(){
		SortByName sort=new SortByName();
		Arrays.sort(this.kit,sort);}
	
	public void sortByPn(){
		SortByPn sort=new SortByPn();
		Arrays.sort(this.kit,sort);}
	
	public void printList(){
		for(Stationery stnr:this.kit){
			System.out.println(stnr.getName()+" by Price "+stnr.getPrice());
		}
	}
}
