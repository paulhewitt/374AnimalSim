package saskatchewan;

import Util.Vector2;

public class Wolf extends Carnivore {

	public Wolf(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'W', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Deer || other instanceof Rabbit) {
			return true;
		}
		return false;
	}
}
