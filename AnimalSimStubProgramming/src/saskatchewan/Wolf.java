package saskatchewan;

import Util.Vector2;

public class Wolf extends Carnivore {

	public Wolf(Vector2 pos) {
		super(15, 2, 'W', 5, pos);
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Deer || other instanceof Rabbit) {
			return true;
		}
		return false;
	}
}
