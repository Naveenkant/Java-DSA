package decoratorPattern;

public class MainClass {

	public static void main(String[] args) {


		Margherita margherita=new Margherita();
		
		ExtraCheese margheritaWithCheese=new ExtraCheese(margherita);
		
		ExtraMushroon margheritaWithCheeseandMushroom =new ExtraMushroon(margheritaWithCheese);
		
		ExtraMushroon margheritaWithMushroom =new ExtraMushroon(margherita);
		
		System.out.println(margherita.cost());
		System.out.println(margherita.cost());
		System.out.println(margheritaWithCheeseandMushroom.cost());
		System.out.println(margheritaWithMushroom.cost());
	}

}
