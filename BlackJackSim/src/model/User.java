package model;

import java.util.ArrayList;
import java.util.List;

public class User {

	//total score of the user
	private int score;
	//List of cards the player has
	private List<Integer> cards;
	//Total money??
	private long money;
	
	//Empty constructor
	public User() {
		score = 0;
		cards = new ArrayList<Integer>();
		
	}
	
	/**
	 * This method adds the hit that was placed on the user to the total score
	 * it also returns true if the player is still 21 or under
	 * @param The card amount hit
	 * @return false if bust else true
	 */
	public boolean add(int hit) {
		score += hit;
		if (score > 21) 
			return false;
		return true;
	}
	
	/**
	 * Returns the total score of the user
	 * @return int score of the user
	 */
	public int getScore() {
		int copyScore = score;
		return copyScore;
	}
	
	/**
	 * Returns the deep copy of the cards that the user has
	 * @return ArrayList<Integer>
	 */
	public ArrayList<Integer> getCards() {
		ArrayList<Integer> copyCards = new ArrayList<Integer>();
		for (int i = 0; i < cards.size(); i++) {
			copyCards.add(cards.get(i));
		}
		return copyCards;
	}
}
