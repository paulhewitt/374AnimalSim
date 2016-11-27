package saskatchewan;

import Util.Vector2;

public class Caterpillar extends Herbivore {

	public Caterpillar(Vector2 pos) {
		super(6, 1, 'C', 2, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Tree || other instanceof Shrub) {
			return true;
		}
		
		return false;
	}
}
