package stationery_task4;

import java.util.Comparator;

public class SortByPrice implements Comparator<Stationery> {

	public int compare(Stationery o1, Stationery o2) {
		int i=0;
		if (o1.getPrice() < o2.getPrice()) {
			i = -1;
		} else if (o1.getPrice() > o2.getPrice()) {
			i = 0;
		} else if (o1.getPrice() == o2.getPrice()) {
			i = 1;
		}
		return i;
	}
}
