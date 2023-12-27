package ticTacToe;

public class Player {

	String name;
	PlayingPiece playingpiece;
	
	Player(String name,PlayingPiece playingpiece){
		this.name=name;
		this.playingpiece=playingpiece;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String x) {
		this.name=x;
	}
	public PlayingPiece getPlayingPiece() {
		return playingpiece;
	}
	public void setPlayingPiece(PlayingPiece playingpiece) {
		this.playingpiece=playingpiece;
	}
}

