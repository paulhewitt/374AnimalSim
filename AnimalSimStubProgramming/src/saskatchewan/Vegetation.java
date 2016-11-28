package saskatchewan;

import Util.Vector2;

public class Vegetation extends Entity {

	private int feed;
	
	public Vegetation (int feed, char display, Vector2 pos) { // animal class constructor
			this.feed = feed;
			this.pos = pos;
			this.display = display;
	}
	
	private boolean isEaten(int feed)
	{
		return true; // just a placeholder for nowa
	}
}
