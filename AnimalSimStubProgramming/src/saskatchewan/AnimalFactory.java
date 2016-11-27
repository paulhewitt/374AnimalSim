package saskatchewan;

import Util.Vector2;

public class AnimalFactory {
	public Animal CreateAnimal(Animals animals, int hunger, int mobility, int moveOrder, int feed, Vector2 pos) {
		switch (animals) {
		
		case Bluejay: 
			return new Bluejay(hunger, mobility, feed, pos);
			
		case Caterpillar: 
			return new Caterpillar(hunger, mobility, feed, pos);
			
		case Deer: 
			return new Deer(hunger, mobility, feed, pos);
			
		case Fox: 
			return new Fox(hunger, mobility, feed, pos);
			
		case Grasshopper: 
			return new Grasshopper(hunger, moveOrder, feed, pos);
			
		case Hawk:
			return new Hawk(hunger, mobility, feed, pos);
			
		case Mouse:
			return new Mouse(hunger, mobility, feed, pos);
			
		case Rabbit:
			return new Rabbit(hunger, mobility, feed, pos);
			
		case Squirrel:
			return new Squirrel(hunger, mobility, feed, pos);
		
		case Wolf:
			return new Wolf(hunger, mobility, feed, pos);
			
		}
		
		return null;
	}
}
