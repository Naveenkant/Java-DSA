package vendingMachine;

public enum Coin {
Penny(1),
Nickel(2),
Dime(5),
Quarter(25),
Ruppe(10);
	
int value;
	Coin(int value){
		this.value=value;
	}
}
