package vendingMachine;

public class IdleState extends State{

	public IdleState() {
		System.out.println("Currently Vending Machine is on Idle state");
	}
	
	@Override
	void clickOnTheInsertCoinButton(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void insertCoin(VendingMachine vendingMachine, Coin coin)throws Exception {
		throw new Exception("First click on insert coin Button");
	}

	@Override
	void selectProductButton(VendingMachine vendingMachine, int code)throws Exception {
		throw new Exception("First click on insert coin Button");
		
	}

	@Override
	void dispenceProduct(VendingMachine vendingMachine, int code) throws Exception{
		throw new Exception("First click on insert coin Button");		
	}

	@Override
	void getChange(int returnChangeMoney) throws Exception{
		throw new Exception("First click on insert coin Button");		
	}

	@Override
	void refundFullMoney(VendingMachine vendingMachine)throws Exception {
		throw new Exception("First click on insert coin Button");		
	}

	@Override
	void updateInventory(VendingMachine vendingMachine, int code, Item item)throws Exception  {
		// TODO Auto-generated method stub
		
	}
	

	

}
