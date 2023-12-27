package snakeAndLadder;
import java.util.*;

public class Game {
	
	Board board;
	Dice dice;
	Deque<Player>players;
	
	Game(){
		initializeGame();
	}
	
	public void initializeGame() {
		board=new Board(5,5);
		dice=new Dice(1);
		players=new LinkedList();
	}
	
}
