package vendingMachine;

public abstract class State {

	abstract void clickOnTheInsertCoinButton(VendingMachine vendingMachine)throws Exception;
	abstract void insertCoin(VendingMachine vendingMachine,Coin coin)throws Exception;
	abstract void selectProductButton(VendingMachine vendingMachine,int code)throws Exception;
	abstract void dispenceProduct(VendingMachine vendingMachine,int code)throws Exception;
	abstract void getChange(int returnChangeMoney)throws Exception;
	abstract void refundFullMoney(VendingMachine vendingMachine)throws Exception;
	abstract void updateInventory(VendingMachine vendingMachine,int code,Item item)throws Exception;
	
}
