package strategyPattern;

public class OffRoadVechile extends Vehicle {
		
	OffRoadVechile() {
		super(new OffRoadStrategy());
		
	}
	

	
}
