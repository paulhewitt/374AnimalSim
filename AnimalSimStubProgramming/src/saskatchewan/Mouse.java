package saskatchewan;

import Util.Vector2;

public class Mouse extends Herbivore {

	public Mouse(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'M', feed, pos);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean canEat(Entity other) {
		if (other instanceof Grass || other instanceof Tree || other instanceof Shrub) {
			return true;
		}
		
		return false;
	}

}
