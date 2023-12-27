package null_pattern;

public class Main {

	public static void main(String[] args) {
		Vehicle car=VehiceFactory.getVehicle("Bike");
		
		System.out.println(car.getSittingCapacity());
		System.out.println(car.getTankCapacity());
	}
}
