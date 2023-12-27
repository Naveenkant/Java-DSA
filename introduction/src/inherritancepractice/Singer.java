package inherritancepractice;

public class Singer extends Person {
public Singer(String name) {
		super(name);
		
	}

public void sing() {
	System.out.println(name+" Singer can sing");
}
}
