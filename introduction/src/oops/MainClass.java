package oops;
class Cat {
	boolean hasFur;
	String color, breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eating() {
		System.out.println("cat is eating");
	}
	public void description(){
		System.out.println("my cat has "+legs+" legs and "+eyes+" eyes");
	}
}
class Dog {
	int legs,eyes;
	String breed, name;
	boolean hasFur ;
	public void jump() {
		System.out.println("my dog "+name+" jumped");
	}
	public void description() {
		System.out.println("my dog name "+name+" has breed"+breed);
	}
}

public class MainClass {

	public static void main(String[] args) {
		
//Cat cat1= new Cat() ;
//Cat cat2 = new Cat();
//cat1.legs  =4;
//cat1.eyes = 2;
//
//cat1.walk();
//cat2.eating();
//cat1.description();
		Dog husky  =new Dog();
		Dog poodle = new Dog();
		husky.breed= " husky";
		husky.name = " Browny";
		poodle.breed=" poodle";
		poodle.name=" Naveen";
		husky.jump();
		husky.description();
		poodle.description();

}
	}


