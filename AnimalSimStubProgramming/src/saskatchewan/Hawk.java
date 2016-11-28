package saskatchewan;

import Util.Vector2;

public class Hawk extends Carnivore {
	
	public Hawk(Vector2 pos) {
		super(5, 3, 'H', 5, pos);
	}
	
	protected boolean canEat(Entity other) {
		if (other instanceof Mouse || other instanceof Squirrel) {
			return true;
		}
		
		return false;
	}

}
