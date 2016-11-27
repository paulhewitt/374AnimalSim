package saskatchewan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Util.Vector2;

public class saskatchewan {
	
	public static final int ROWS = 20;
	public static final int COLS = 20;
	
	public static final Entity[][] world = new Entity[ROWS][COLS];
	static List<Animal> animals = new ArrayList<Animal>();
	static List<Vegetation> plants = new ArrayList<Vegetation>();
	static AnimalFactory af = new AnimalFactory();
	static PlantFactory pf = new PlantFactory();
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		generateWorld();
		worldTick();
		
		Scanner sc = new Scanner(System.in);
		String in;
		
		do {
			System.out.println("Type 'animal' to add a new random animal,\n'plant' for a random plant,\n'tick' to simulate the world, or type 'exit' to exit: ");
			in = sc.next();
			if (in.equals("animal")) {
				int x, y;
				do {
					x = r.nextInt(ROWS);
					y = r.nextInt(COLS);
				} while (world[x][y] != null);
				animals.add(af.CreateAnimal(Animals.getRandomAnimal(), 100, 1, 10, 5, new Vector2(x,y)));
				worldTick();
			} else if (in.equals("plant")) {
				int x, y;
				do {
					x = r.nextInt(ROWS);
					y = r.nextInt(COLS);
				} while (world[x][y] != null);
				plants.add(pf.CreatePlant(Plants.getRandomPlant(), 5, new Vector2(x,y)));
				worldTick();
			} else if (in.equals("tick")) {
				worldTick();
			}
		} while (!in.equals("exit"));
		
	}
	
	static void generateWorld() {
		for (int i=0;i<10;i++) {
			animals.add(af.CreateAnimal(Animals.getRandomAnimal(), 100, 1, 10, 5, new Vector2(i, i)));
		}
		for (int i=10;i<15;i++) {
			plants.add(pf.CreatePlant(Plants.getRandomPlant(), 5, new Vector2(i,i)));
		}
	}
	
	static void deleteEntity(int x, int y) {
		world[x][y] = null;
	}
	
	static void worldTick() {
		for (Iterator<Animal> iterator = animals.iterator(); iterator.hasNext();) {
		    Animal a = iterator.next();
		    if (a.isDead()) { //Check if animal is dead and delete if it is
		    	deleteEntity(a.pos.x,a.pos.y);
				iterator.remove();
				continue;
		    }
		    world[a.pos.x][a.pos.y] = null; //Reset animals world position to blank to prepare for it's move
		    a.tick(); //Perform animals tick actions 
			world[a.pos.x][a.pos.y] = a; //Put the animal in the world
		}
		for (Vegetation p: plants){
			world[p.pos.x][p.pos.y] = p;
		}
		displayWorld();
	}
	
	static void displayWorld() {
		for (int y=0;y<ROWS;y++) {
			for (int x=0;x<COLS;x++) {
				if (world[x][y] == null) {
					System.out.print('x' + " ");
					continue;
				}
				System.out.print(world[x][y].display + " ");
			}
			System.out.println("");
		}
	}
}
