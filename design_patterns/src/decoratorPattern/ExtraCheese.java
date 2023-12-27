package decoratorPattern;

public class ExtraCheese extends DecoratorToppings{

	BasePizza bp;
	ExtraCheese(BasePizza bp) {
		this.bp=bp;
		
	}
	@Override
	public int cost() {
		return bp.cost()+15;
				
	}

}
