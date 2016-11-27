package saskatchewan;

import Util.Vector2;

public class Bluejay extends Omnivore {

	public Bluejay(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'B', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Shrub || other instanceof Tree || other instanceof Grasshopper) {
			return true;
		}
		
		return false;
	}
}
