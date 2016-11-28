package saskatchewan;

import Util.Vector2;

public class Fox extends Carnivore {

	public Fox(Vector2 pos) {
		super(16, 2, 'F', 4, pos);
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Mouse || other instanceof Squirrel || other instanceof Rabbit) {
			return true;
		}
		
		return false;
	}
}
