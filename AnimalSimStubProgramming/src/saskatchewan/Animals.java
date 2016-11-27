package saskatchewan;

import java.util.Random;

public enum Animals {
	Bluejay, Caterpillar, Deer, Fox, 
	Grasshopper, Hawk, Mouse, Rabbit, 
	Squirrel, Wolf;
	
	private static final Animals[] VALUES = values();
	private static final int SIZE = VALUES.length;
	private static final Random RANDOM = new Random();

	public static Animals getRandomAnimal()  {
		return VALUES[RANDOM.nextInt(SIZE)];
	}
}
