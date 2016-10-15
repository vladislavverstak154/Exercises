package stationery_task3;

//Necomer's Kit

public class NcKit {
	Stationery[] kit=new Stationery[8];
	public NcKit(){
		kit[0]=new Pen("red",0.3);
		kit[1]=new Pen("black",0.35);
		kit[2]=new Pen();
		kit[3]=new Pencil();
		kit[4]=new Pencil("green",0.2);
		kit[5]=new PaperStationery(420,550);
		kit[6]=new PaperStationery(840,1100);
		kit[7]=new PaperStationery();
		
		
	}
}
