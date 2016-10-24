package stationery_task4;

public class Test {
	public static void main(String[] args) {
		NcKit newComerKit = new NcKit();
		newComerKit.printList();
		newComerKit.sortByPrice();
		System.out.println("NcKit has been sorted by price");
		newComerKit.printList();
		
	}
}
