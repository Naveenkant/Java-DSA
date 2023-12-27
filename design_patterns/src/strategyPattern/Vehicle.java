package strategyPattern;

public class Vehicle{
	DriveStrategy ds;
	
	Vehicle(DriveStrategy ds){
		this.ds=ds;
	}
	void drive() {
		ds.drive();
	}
	
}
