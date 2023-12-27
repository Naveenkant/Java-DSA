package vendingMachine;

public class Inventory {

	ItemShelf inventory[]=null;
	
	Inventory(int itemCount){
		inventory=new ItemShelf[itemCount];
		
	}

	public ItemShelf[] getInventory() {
		return inventory;
	}

	public void setInventory(ItemShelf[] inventory) {
		this.inventory = inventory;
	}
	
	public void initializeEmptyInventory() {
		int startCode=101;
		
		for(int i=0;i<inventory.length;i++) {
			inventory[i]=new ItemShelf();
			inventory[i].code=startCode;
			inventory[i].soldOut=true;
			startCode++;
		}
	}
	public void addItem(Item item,int code)throws Exception{
			boolean canAdd=false;
		for(int i=0;i<inventory.length;i++) {
			if(inventory[i].soldOut==true && inventory[i].code==code) {
				inventory[i].item=item;
				canAdd=true;
			}
		}
		if(!canAdd)throw new Exception("Item is already present in the inventory");
		
	}
	
	
}
