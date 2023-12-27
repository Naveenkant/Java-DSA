package inherritancepractice;

public class Teacher extends Person{
	public Teacher (String name ) {
		
		
		super(name);
		System.out.println("inside Teacher constructor");
	}

	public void teach() {
		System.out.println(name+" Teacher is teaching");
		
	}
	public void eat() {
		super.eat();
		System.out.println("Teacher is eating");
	}
}
