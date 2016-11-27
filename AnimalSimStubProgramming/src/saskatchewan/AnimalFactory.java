package saskatchewan;

import Util.Vector2;

public class AnimalFactory {
	public Animal CreateAnimal(Animals animals, Vector2 pos) {
		switch (animals) {
		
		case Bluejay: 
			return new Bluejay(pos);
			
		case Caterpillar: 
			return new Caterpillar(pos);
			
		case Deer: 
			return new Deer(pos);
			
		case Fox: 
			return new Fox(pos);
			
		case Grasshopper: 
			return new Grasshopper(pos);
			
		case Hawk:
			return new Hawk(pos);
			
		case Mouse:
			return new Mouse(pos);
			
		case Rabbit:
			return new Rabbit(pos);
			
		case Squirrel:
			return new Squirrel(pos);
		
		case Wolf:
			return new Wolf(pos);
			
		}
		
		return null;
	}
}
