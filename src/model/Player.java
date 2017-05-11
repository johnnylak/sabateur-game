package model;

import java.util.ArrayList;
import java.util.List;

import model.cards.Card;

public class Player {
	
    private String name;
    private String role;
    private String status;
    private int UID;
    private Hand hand;
    private Boolean toolsDamaged = false;
    private int gold;
    private List<Player> heists;

    public Player (String PlayerName, Hand hand, String role) {

        name = PlayerName;
        this.hand = hand;
        this.role = role;
        this.gold = 0;
        
    }
    
    public Player (String PlayerName, Hand hand) {

        name = PlayerName;
        this.hand = hand;
        this.gold = 0;
        
    }

    public int getUID() {
    	
    	return UID;
    	
    }

    public void setUID(int UID) {
    	
    	this.UID = UID;
    	
    }

    public String getName() {
    	
        return name;
        
    }

    public void setName(String name) {
    	
        this.name = name;
        
    }

    public String getRole() {
    	
        return role;
        
    }

    public void setRole(String role) {
    	
        this.role = role;
        
    }
    
    public void drawCard() {
    	
    	Card card = Deck.getInstance().draw();
    	if(card != null) {
    		
    		getHand().addCard(card);
    		
    	}
    	
    }

    public Hand getHand() {
    	
    	return hand;
    	
    }

    public void setHand(Hand hand) {
    	
    	this.hand = hand;
    	
    }
    
    public String getStatus() {
    	
    	return status;
    	
    }

    public void setStatus(String status) {
    	
    	this.status = status;
    	
    }
    public Boolean areToolsDamaged(){
    	return toolsDamaged;
    }
    public void changeToolsDamage(){
    	if(toolsDamaged == true)
    		toolsDamaged = false;
    	else
    		toolsDamaged = true;
    }
    
    public int getGold() {
    	
    	return gold;
    	
    }
    
    public void addGold(int gold) {
    	
    	this.gold+=gold;
    	
    }
    
    public void planHeist(Player player) {
    	
    	if (!player.equals(this)) {
    		
    		if (heists == null) {
        		
        		heists = new ArrayList<Player>();
        		
        	}
        	
        	heists.add(player);
    		
    	}
    	
    }
    
    public List<Player> getPlannedHeists() {
    	
    	return heists;
    	
    }
    
}