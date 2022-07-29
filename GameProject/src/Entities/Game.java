package Entities;

public class Game {

	int gameId;
	String gameName;
	public Game(int gameId, String gameName) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
