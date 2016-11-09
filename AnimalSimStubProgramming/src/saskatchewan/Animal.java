package saskatchewan;

import Util.Vector2;

public class Animal extends Entity { // animal class
	private int hunger;
	private int mobility;
	private int moveOrder;
	private int feed;
	
	public Animal (int hunger, int mobility, int moveOrder, char display, int feed, Vector2 pos) { // animal class constructor
			this.hunger = hunger;
			this.mobility = mobility;
			this.moveOrder = moveOrder;
			this.display = display;
			this.feed = feed;
			this.pos = pos;
	}
	
	private boolean isDead(int hunger)
	{
		return true; // just a placeholder for now
	}

}
