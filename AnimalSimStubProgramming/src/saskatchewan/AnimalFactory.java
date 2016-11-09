package saskatchewan;

import Util.Vector2;

public class AnimalFactory {
	public Animal CreateAnimal(Animals animals, int hunger, int mobility, int moveOrder, int feed, Vector2 pos) {
		switch (animals) {
		
		case Bluejay: 
			return new Bluejay(hunger, mobility, moveOrder, feed, pos);
			
		case Caterpillar: 
			return new Caterpillar(hunger, mobility, moveOrder, feed, pos);
			
		case Deer: 
			return new Deer(hunger, mobility, moveOrder, feed, pos);
			
		case Fox: 
			return new Fox(hunger, mobility, moveOrder, feed, pos);
			
		case Grasshopper: 
			return new Grasshopper(hunger, mobility, moveOrder, feed, pos);
			
		case Hawk:
			return new Hawk(hunger, mobility, moveOrder, feed, pos);
			
		case Mouse:
			return new Mouse(hunger, mobility, moveOrder, feed, pos);
			
		case Rabbit:
			return new Rabbit(hunger, mobility, moveOrder, feed, pos);
			
		case Squirrel:
			return new Squirrel(hunger, mobility, moveOrder, feed, pos);
		
		case Wolf:
			return new Wolf(hunger, mobility, moveOrder, feed, pos);
			
		}
		
		return null;
	}
}
