package vendingMachine;

public class Main {

	public static void main(String[] args) throws Exception {
		VendingMachine machine =new VendingMachine();
		
		System.out.println("filling up the inventory");
		fillUpTheInventory(machine);
		System.out.println("|");
		
		System.out.println("clicking on the insert Coin button");
		System.out.println("|");
		State vendingState=machine.getVendingMachineState();
		vendingState.clickOnTheInsertCoinButton(machine);
		
		vendingState=machine.getVendingMachineState();
		vendingState.insertCoin(machine, Coin.Nickel);
		vendingState.insertCoin(machine, Coin.Dime);
		
		System.out.println("|");
		System.out.println("Now clicking on the product selection button");
		System.out.println("|");
		
		
		vendingState=machine.getVendingMachineState();
		vendingState.selectProductButton(machine, 101);
		
		displayInventory()
	}
	
	public static void fillUpTheInventory(VendingMachine vendingMachine) {
		ItemShelf []slots=vendingMachine.inventory.getInventory();
		
		for(int i=0;i<slots.length;i++) {
			Item newItem=new Item();
			if(i>=0 && i<=2) {
				newItem.setItemType(ItemType.Coke);
				newItem.setPrice(20);
				
			}else if(i>=3 && i<=5) {
				newItem.setItemType(ItemType.Pepsi);
				newItem.setPrice(30);
			}else if(i>=6 && i<=8) {
				newItem.setItemType(ItemType.Juice);
				newItem.setPrice(40);
			}else {
				newItem.setItemType(ItemType.Soda);
				newItem.setPrice(25);
			}
			slots[i].item=newItem;
			slots[i].soldOut=false;
		}
	}
}
