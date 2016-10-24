package stationery_task4;

import java.util.Comparator;

public class SortByPrice implements Comparator<Stationery> {

	public int compare(Stationery stnr1, Stationery stnr2) {
		int i=0;
		if (stnr1.getPrice() < stnr2.getPrice()) {
			i = -1;
		} else if (stnr1.getPrice() > stnr2.getPrice()) {
			i = 0;
		} else if (stnr1.getPrice() == stnr2.getPrice()) {
			i = 1;
		}
		return i;
	}
}
