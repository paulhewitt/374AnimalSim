package saskatchewan;

import Util.Vector2;

public class Bluejay extends Omnivore {

	public Bluejay(Vector2 pos) {
		super(10, 3, 'B', 4, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Shrub || other instanceof Tree || other instanceof Grasshopper) {
			return true;
		}
		
		return false;
	}
}
