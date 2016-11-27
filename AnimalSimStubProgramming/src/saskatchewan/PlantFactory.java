package saskatchewan;

import Util.Vector2;

public class PlantFactory {
	public Vegetation CreatePlant(Plants plants, int feed, int size, Vector2 pos) {
		switch (plants) {
		
		case Tree: 
			return new Tree(feed, size, pos);
			
		case Shrub: 
			return new Shrub( feed, size, pos);
			
		case Grass: 
			return new Grass(feed, size, pos);
			
		}
		
		return null;
	}
}