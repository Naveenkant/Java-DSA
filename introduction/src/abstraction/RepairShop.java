package abstraction;

public class RepairShop {


	public static  void repairCar(Car car) {
		System.out.println("car is repaired");
	}
	
	public static void main(String[] args) {

		WagnR w = new WagnR();
		Audi a = new Audi();
		
		repairCar(w);
		repairCar(a);
		
				
	}

}
