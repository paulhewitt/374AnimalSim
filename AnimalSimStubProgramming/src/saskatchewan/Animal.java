package saskatchewan;

public class Animal { // animal class
	private int hunger;
	private int mobility;
	private int moveOrder;
	private char display;
	private int feed;
	
	public Animal (int hunger, int mobility, int moveOrder, char display, int feed) { // animal class constructor
			this.hunger = hunger;
			this.mobility = mobility;
			this.moveOrder = moveOrder;
			this.display = display;
			this.feed = feed;
		}
	
	private boolean isDead(int hunger)
	{
		return true; // just a placeholder for now
	}

}
