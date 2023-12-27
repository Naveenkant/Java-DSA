package strategyPattern;

public class PassengerVehicle extends Vehicle{

	PassengerVehicle(){
		super(new NormalStrategy());
	}
}
