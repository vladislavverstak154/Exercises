package stationery_task4;

import java.util.Arrays;

//Necomer's Kit

public class NcKit implements SortByName, SortByPrice, SortByNP  {
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

	public static Comparator<Stationery> PriceComparator = new Comparator<Stationery>() {
		 
        @Override
        public int compare(Stationery str1, Stationery str2) {
            return (int) (str1.getPrice() - str1.getPrice());
        }
    };
 
    // компаратор сортирует список или массив объектов по возрасту
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    }; 
        // компаратор сортирует список или массив объектов по имени
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
	
	public void printList(){
		for(Stationery stnr:this.kit){
			System.out.println(stnr.getName()+" by Price "+stnr.getPrice());
		}
	}
}
