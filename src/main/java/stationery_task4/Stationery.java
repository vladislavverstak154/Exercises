package stationery_task4;

/**
 * Class Stationery
 * 
 * @author vladislav
 *
 */
public class Stationery implements Comparable <Stationery>, ISortByName {
	
	private String name;
	private double price;
	
		
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		
	public String sortByName(){
		return this.name;
	}

	public int compareTo(Stationery stnr) {
		if(this.getPrice()<stnr.getPrice()){
			return -1;
		}
		else if(this.getPrice()>stnr.getPrice()){
			return 1;
		}
		else{return 0;}
	}
	
	//Comparator для сортировки списка или массива объектов по зарплате
    public static Comparator<Stationery> nameComparator = new Comparator<Stationery>() {
 
        @Override
        public int compare(Stationery str1, Stationery str2) {
        	int i=-1;
        	if(str1.getName().equals(str2.getName())){
        		i=0;        		
        	}
        	
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };
 
      //Comparator для сортировки списка или массива объектов по возрасту
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };
 
       //Comparator для сортировки списка или массива объектов по имени
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
 
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
	
}
