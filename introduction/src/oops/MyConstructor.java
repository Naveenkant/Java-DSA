package oops;
class vehicle {
	int wheels,headlights;
	String colour;
	vehicle (){
		wheels  =4;
	}
	vehicle(int wheels){
		this.wheels= wheels;
		headlights = 2;
	}
	vehicle(int wheels , String colour){
		this.wheels= wheels;
		this.colour = colour;
		headlights = 2;
	}
}

public class MyConstructor {
	MyConstructor (){
		System.out.println("object is now created");
		
	}
	

	public static void main(String[] args) {

//		MyConstructor obj= new MyConstructor();
		vehicle car = new vehicle(4);
		
	
		
		vehicle scooty = new vehicle(2,"red");
		vehicle naava  =new vehicle ();
		
		
		System.out.println(car.wheels+" wheels");
		
		
		
	}

}
