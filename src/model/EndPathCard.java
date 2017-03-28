package model;

public class EndPathCard extends PathCard{
	
	/*
	 * For exits:
	 * exit 0 = left
	 * exit 1 = up
	 * exit 2 = right
	 * exit 3 = down
	 */
	
	
	public EndPathCard(int rotation){
		this.rotation = rotation;
		
		this.exits[0] = true;
		this.exits[1] = false;
		this.exits[2] = false;
		this.exits[3] = false;
	}
	
}
