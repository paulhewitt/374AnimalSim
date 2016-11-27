package saskatchewan;

import Util.Vector2;

public class Deer extends Omnivore {

	public Deer(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'D', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Grass || other instanceof Tree || other instanceof Shrub) {
			return true;
		}
		
		return false;
	}
}
