package saskatchewan;

import Util.Vector2;

public class Mouse extends Herbivore {

	public Mouse(Vector2 pos) {
		super(10, 1, 'M', 3, pos);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean canEat(Entity other) {
		if (other instanceof Grass || other instanceof Tree || other instanceof Shrub) {
			return true;
		}
		
		return false;
	}

}
