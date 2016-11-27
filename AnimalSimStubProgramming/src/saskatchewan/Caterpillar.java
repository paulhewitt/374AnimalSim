package saskatchewan;

import Util.Vector2;

public class Caterpillar extends Herbivore {

	public Caterpillar(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'C', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Tree || other instanceof Shrub) {
			return true;
		}
		
		return false;
	}
}
