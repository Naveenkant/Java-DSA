package vendingMachine;

public class ItemShelf {
	
	int code;
	Item item;
	boolean soldOut;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Item getItems() {
		return item;
	}
	public void setItems(Item items) {
		this.item = items;
	}
	public boolean isSoldOut() {
		return soldOut;
	}
	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
}
