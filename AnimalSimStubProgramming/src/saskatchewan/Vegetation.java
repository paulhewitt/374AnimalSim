package saskatchewan;

import Util.Vector2;

public class Vegetation extends Entity {

	private int feed;
	private int size;
	
	public Vegetation (int feed, int size, Vector2 pos) { // animal class constructor
			this.feed = feed;
			this.pos = pos;
	}
	
	private boolean isEaten(int feed)
	{
		return true; // just a placeholder for now
	}
}
