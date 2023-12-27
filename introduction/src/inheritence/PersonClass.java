package inheritence;

public class PersonClass {

protected String name;

public PersonClass (String name) {
	this .name = name;
	System.out.println("inside person constructor");
}

      public void walk() {
    	  System.out.println("person "+ name+ " is walking");
      }
      public void eat() {
    	  System.out.println("person " + name+ " is eating");
      }
      
	}

