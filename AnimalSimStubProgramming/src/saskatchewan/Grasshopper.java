package saskatchewan;

import Util.Vector2;

public class Grasshopper extends Herbivore {

	public Grasshopper(int hunger, int mobility, int feed, Vector2 pos) {
		super(hunger, mobility, 'G', feed, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Grass) {
			return true;
		}
		
		return false;
	}
}
