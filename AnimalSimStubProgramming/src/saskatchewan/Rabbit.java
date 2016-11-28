package saskatchewan;

import Util.Vector2;

public class Rabbit extends Herbivore {

	public Rabbit(Vector2 pos) {
		super(10, 3, 'R', 4, pos);
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Grass) {
			return true;
		}
		
		return false;
	}
}
