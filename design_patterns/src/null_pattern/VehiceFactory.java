package null_pattern;

public class VehiceFactory {

	
	static Vehicle getVehicle(String s) {
		if(s.contentEquals("Car")) {
			return (Vehicle) new Car();
		}
		return (Vehicle) new NullVehicle();
	}

	

	}
