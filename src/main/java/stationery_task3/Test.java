package stationery_task3;

public class Test {
	public static void main(String[] args) {
		NcKit newComerKit = new NcKit();
		Pen[] penBox;
		Pencil[] pencilBox;
		PaperStationery[] paperStationeryBox;
	}

	void sortByName(ISortByName... kit) {
		Pen[] penBox;
		Pencil[] pencilBox;
		PaperStationery[] paperBox;
		int penCount = 0;
		int pencilCount = 0;
		int paperCount = 0;
		for (int i = 0; i < kit.length; i++) {
			if (kit[i].equals(new Pen())) {
				penCount++;
			} else if (kit[i].equals(new Pencil())) {
				pencilCount++;
			} else if (kit[i].equals(new PaperStationery())) {
				paperCount++;
			}
		}

	}
}
