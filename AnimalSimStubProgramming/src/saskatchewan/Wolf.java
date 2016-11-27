package saskatchewan;

import Util.Vector2;

public class Wolf extends Carnivore {

	public Wolf(Vector2 pos) {
		super(10, 2, 'W', 5, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Deer || other instanceof Rabbit) {
			return true;
		}
		return false;
	}
}
