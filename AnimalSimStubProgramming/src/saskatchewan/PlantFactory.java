package saskatchewan;

import Util.Vector2;

public class PlantFactory {
	public Vegetation CreatePlant(Plants plants, int feed, Vector2 pos) {
		switch (plants) {
		
		case Tree: 
			return new Tree(feed, pos);
			
		case Shrub: 
			return new Shrub(feed, pos);
			
		case Grass: 
			return new Grass(feed, pos);
			
		}
		
		return null;
	}
}