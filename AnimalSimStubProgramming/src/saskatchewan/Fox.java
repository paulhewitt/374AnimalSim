package saskatchewan;

import Util.Vector2;

public class Fox extends Carnivore {

	public Fox(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'F', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Mouse || other instanceof Squirrel || other instanceof Rabbit) {
			return true;
		}
		
		return false;
	}
}
