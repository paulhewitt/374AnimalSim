package saskatchewan;

import Util.Vector2;

public class Squirrel extends Herbivore {

	public Squirrel(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'S', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Shrub || other instanceof Tree) {
			return true;
		}
		
		return false;
	}
}
