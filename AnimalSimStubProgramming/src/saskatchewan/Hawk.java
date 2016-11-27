package saskatchewan;

import Util.Vector2;

public class Hawk extends Carnivore {

	public Hawk(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'H', feed, pos);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean canEat(Entity other) {
		if (other instanceof Mouse || other instanceof Squirrel) {
			return true;
		}
		
		return false;
	}

}
