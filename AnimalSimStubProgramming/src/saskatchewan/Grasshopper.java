package saskatchewan;

import Util.Vector2;

public class Grasshopper extends Herbivore {

	public Grasshopper(Vector2 pos) {
		super(7, 1, 'G', 3, pos);
		// TODO Auto-generated constructor stub
	}

	protected boolean canEat(Entity other) {
		if (other instanceof Grass) {
			return true;
		}
		
		return false;
	}
}
