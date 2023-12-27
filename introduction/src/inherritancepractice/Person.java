package inherritancepractice;

public class Person {

	protected String name;
	public Person (String name) {
		this.name = name;
		System.out.println("inside person constructor");
	}
	
	public void walk() {
		System.out.println(name+" Person is walking");
	}
	public void eat () {
		System.out.println(name+" person is eating");
	}

}
