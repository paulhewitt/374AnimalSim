package saskatchewan;

import Util.Vector2;

public class Squirrel extends Herbivore {
	
	public Squirrel(Vector2 pos) {
		super(6, 2, 'S', 5, pos);
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Shrub || other instanceof Tree) {
			return true;
		}
		
		return false;
	}
}
