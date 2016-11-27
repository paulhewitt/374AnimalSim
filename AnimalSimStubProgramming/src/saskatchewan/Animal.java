package saskatchewan;

import java.util.Random;

import Util.Vector2;

public class Animal extends Entity { // animal class
	protected int hunger;
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
			Entity other = saskatchewan.world[pos.x][pos.y];
			if (canEat(other)) {
				eat(other);
			} else {
				pos = oldPos;
			}
		}
	}
	
	protected boolean canEat(Entity other) {
		return false;
	}
	
	private void eat(Entity other) {
		this.hunger += other.getFeed();
		saskatchewan.world[other.pos.x][other.pos.y] = null;
		if (other instanceof Animal)
			((Animal) other).hunger = 0;
		System.out.println(this.getClass().getSimpleName() + " ate " + other.getClass().getSimpleName() + " at " + pos.x + " " + pos.y);
	}
	
	public int getFeed() {
		return feed;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public void setHunger(int h) {
		hunger = h;
	}
}
