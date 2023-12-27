package vendingMachine;
import java.util.*;
public class VendingMachine {

	public State vendingMachineState;
	public Inventory inventory;
	public ArrayList<Coin>coinList;
	
	VendingMachine(){
		vendingMachineState=new IdleState();
		inventory=new Inventory(10);
		coinList=new ArrayList<>();
	}
	
	public State getVendingMachineState() {
		return vendingMachineState;
	}
	public void setVendingMachineState(State vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public ArrayList<Coin> getCoins() {
		return coinList;
	}
	public void setCoins(ArrayList<Coin> coins) {
		this.coinList = coins;
	}
	
	
}
