package saskatchewan;

import Util.Vector2;

public class Deer extends Omnivore {

	public Deer(Vector2 pos) {
		super(7, 2, 'D', 7, pos);
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Grass || other instanceof Tree || other instanceof Shrub) {
			return true;
		}
		
		return false;
	}
}
