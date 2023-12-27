package decoratorPattern;

public class ExtraMushroon extends DecoratorToppings{

	BasePizza bp;
	ExtraMushroon(BasePizza bp) {
		this.bp=bp;
		
	}
	
	@Override
	public int cost() {
		
		return bp.cost()+20;
	}

}
