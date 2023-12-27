package inheritence;

public class Singer extends PersonClass {

	public Singer (String name) {
		super(name);
		
	}
	public void sing() {
		System.out.println( name +" is singing");
	}
		public void eat () {
			System.out.println("singer "+ name + "is eating");
		}
	
	
	
	
}
