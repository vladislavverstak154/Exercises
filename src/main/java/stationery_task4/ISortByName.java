package stationery_task4;

public class ISortByName {
	public static void PriceSort(Stationery[] arr){
	     for(int i = arr.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	                if( arr[j].getPrice() > arr[j+1].getPrice()){
	                Stationery tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	    }
	}	
}
