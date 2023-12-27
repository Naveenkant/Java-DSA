package abstraction.practice;

public class RepairShop {

	public static void repairCar(Car car) {
		System.out.println("car is repaired");
	}
	
	public static void main(String[] args) {
		Wagnor wagnor = new Wagnor();
		Audi audi = new Audi();
		repairCar(wagnor);
		repairCar(audi);
		
	}
}
