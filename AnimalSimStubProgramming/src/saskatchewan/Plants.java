package saskatchewan;

import java.util.Random;

public enum Plants {
	Tree, Shrub, Grass;
	
	private static final Plants[] VALUES = values();
	private static final int SIZE = VALUES.length;
	private static final Random RANDOM = new Random();

	public static Plants getRandomPlant()  {
		return VALUES[RANDOM.nextInt(SIZE)];
	}

}
