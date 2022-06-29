package Reverse;

public class Cricket {
	private String playerName;
	private boolean isBatsMan;
	private int playersScore;
	private int playerAge;
	private int wicketTaken;
	
	public Cricket(String playerName,boolean isBatsMan,int playersScore,int playerAge,int wicketTaken) {
		this.playerName=playerName;
		this.isBatsMan=isBatsMan;
		this.playersScore=playersScore;
		this.playerAge=playerAge;
		this.wicketTaken=wicketTaken;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public boolean isBatsMan() {
		return isBatsMan;
	}

	public void setBatsMan(boolean isBatsMan) {
		this.isBatsMan = isBatsMan;
	}

	public int getPlayersScore() {
		return playersScore;
	}

	public void setPlayersScore(int playersScore) {
		this.playersScore = playersScore;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public int getWicketTaken() {
		return wicketTaken;
	}

	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	public String toString() {
		return playerName+" "+isBatsMan+" "+playersScore+" "+playerAge+" "+wicketTaken;
	}

}
