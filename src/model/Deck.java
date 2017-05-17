package model;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

import model.cards.*;

public class Deck {
	
	private static Deck ourInstance = new Deck();

	public static Deck getInstance() {
		return ourInstance;
	}

	private static Stack<Card> deck = new Stack<Card>();
	
	public void shuffle(){
		
		//shuffle all cards in deck
		Collections.shuffle(deck);
		
	}

	public Card draw(){
		//drawn next card from deck
		//return null if no cards in deck
		if(deck.isEmpty() == false) {
			return deck.pop();
		}
		return null;
	}
	
	//print card name to console, for debugging:
	public void printCards() {
		System.out.println("cards2 stack printout: ");
		Iterator<Card> deckIteration = deck.iterator();
		while (deckIteration.hasNext()) {
			System.out.println(deckIteration.next());
		}
	}

	public void addLPathCards(int totalCards) {
		
		for(int i = 0; i<totalCards; i++) {
			
			LPathCard lPCard = new LPathCard(0);
			deck.push(lPCard);
			
		}
		
	}
	
	public void addXPathCards(int totalCards) {
		
		for(int i = 0; i<totalCards; i++) {
			
			XPathCard xCard = new XPathCard(0);
			deck.push(xCard);
			
		}
		
	}
	
	/*
	 * For Assignment 2
	private void addBlockPathCards(int totalCards) {
		
		for(int i = 0; i<totalCards; i++){
			BlockPathCard blockCard = new BlockPathCard(0);
			deck.push(blockCard);
			
		}
		
	}
	*/
	
	public void addStraightPathCards(int totalCards) {
		for(int i = 0; i<totalCards; i++) {
			StraightPathCard straightCard = new StraightPathCard(0);
			deck.push(straightCard);
		}
	}
	
	public void addTPathCards(int totalCards) {
		for(int i = 0; i<totalCards; i++) {
			TPathCard tPathCard = new TPathCard(0);
			deck.push(tPathCard);
		}
	}

	public void addToxicCard(int totalCards) {
		for(int i = 0; i<totalCards; i++) {
			ToxicCard toxicCard = new ToxicCard();
			deck.push(toxicCard);
		}
	}
	
	public void addEndPathCard(int totalCards) {
		
		for(int i = 0; i<totalCards; i++) {
			
			EndPathCard endCard = new EndPathCard(0);
			deck.push(endCard);
			
		}
		
	}
	
	public static Stack<Card> getDeck() {
		
		return deck;
		
	}
	
	public void clearDeck() {
		
		deck.clear();
		
	}
	
	public static void setDeck(Stack<Card> oldDeck){
	    System.out.println("number of cards in deck: "+Deck.getDeckSize());
	    deck = oldDeck;
	    System.out.println("number of cards in deck after change: "+Deck.getDeckSize());
	    System.out.println("number of cards in oldDeck: "+oldDeck.size());
	    
	}
	public static int getDeckSize(){
	    return deck.size();
	}

}
