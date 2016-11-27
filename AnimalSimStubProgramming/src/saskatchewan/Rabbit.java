package saskatchewan;

import Util.Vector2;

public class Rabbit extends Herbivore {

	public Rabbit(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'R', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Grass) {
			return true;
		}
		
		return false;
	}
}
