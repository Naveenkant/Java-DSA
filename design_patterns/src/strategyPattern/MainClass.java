package strategyPattern;

public class MainClass {

	public static void main(String[] args) {
	
		OffRoadVechile thar= new OffRoadVechile();
			thar.drive();
		
		PassengerVehicle bus=new PassengerVehicle();
		bus.drive();
	}

}
