package model;

public class Dealer {

	private int score;
	
	public Dealer() {
		score = 0;
	}
	
	public boolean add(int hit) {
		score += hit;
		if (score > 21) 
			return false;
		return true;
	}
	
	public int getScore() {
		int copyScore = score;
		return copyScore;
	}
}
