package saskatchewan;

import java.util.Random;

import Util.Vector2;

public class Animal extends Entity { // animal class
	private int hunger;
	private int mobility;
	private int feed;
	
	public Animal (int hunger, int mobility, char display, int feed, Vector2 pos) { // animal class constructor
			this.hunger = hunger;
			this.mobility = mobility;
			this.display = display;
			this.feed = feed;
			this.pos = pos;
	}
	
	public boolean isDead()
	{
		if (hunger <= 0)
			return true;
		return false;
	}
	
	public void tick() {
		//Placeholder for each animals tick
		move();
		hunger--;
	}
	
	private void move() {
		Random rand = new Random();
		int randX = -mobility + rand.nextInt((mobility + mobility) + 1);
		int randY = -mobility + rand.nextInt((mobility + mobility) + 1);
		
		Vector2 oldPos = new Vector2(pos.x, pos.y); 
		
		pos.x += randX;
		pos.y += randY;
		//Check for out of bounds
		if (pos.x < 0 || pos.x >= saskatchewan.COLS || pos.y < 0 || pos.y >= saskatchewan.ROWS) {
			pos = oldPos;
		}
		//Check if there is another thing on our next tile
		//In future this can be used to check for eating
		if (saskatchewan.world[pos.x][pos.y] != null) {
			pos = oldPos;
		}
		System.out.println(oldPos.x + " " + oldPos.y + " -> " + pos.x + " " + pos.y);
	}
}
