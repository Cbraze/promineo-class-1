package week_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
	
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				cards.add(new Card(j, createCardName(i, j)));
			}
		}
		shuffle();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	private String createCardName(int suit, int value) {
		return new StringBuilder()
				.append(determineValueString(value))
				.append(" of ")
				.append(determineSuitString(suit))
				.toString();
	}
	
	private String determineSuitString(int suit) {
		String result = "";
		switch (suit) {
			case 0:
				result = "Heart";
				break;
			case 1:
				result = "Diamond";
				break;
			case 2:
				result = "Club";
				break;
			case 3:
				result = "Spade";
				break;
			default:
				result = "Default";
		}
		return result;
	}
	
	private String determineValueString(int value) {
		String result = "";
		switch (value) {
			case 11:
				result = "Jack";
				break;
			case 12:
				result = "Queen";
				break;
			case 13:
				result ="King";
				break;
			case 14:
				result = "Ace";
				break;
			default:
				result = "" + value;
		}
		return result;
	}

}
