package saskatchewan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
	
	private static Scanner sc;
	
	public static Queue<String> alerts = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		generateWorld();
		worldTick();
		
		sc = new Scanner(System.in);
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
		Random r = new Random();
		int randX = r.nextInt(ROWS);
		int randY = r.nextInt(COLS);
		
		//Add 10 random animals
		for (int i=0;i<10;i++) {
			do {
				randX = r.nextInt(ROWS);
				randY = r.nextInt(COLS);
			} while(world[randX][randY] != null);
			Animal a = af.CreateAnimal(Animals.getRandomAnimal(), 100, 1, 10, 5, new Vector2(randX, randY));
			world[a.pos.x][a.pos.y] = a;
			animals.add(a);
		}
		
		//Add 10 random plants
		for (int i=0;i<10;i++) {
			do {
				randX = r.nextInt(ROWS);
				randY = r.nextInt(COLS);
			} while(world[randX][randY] != null);
			Vegetation p = pf.CreatePlant(Plants.getRandomPlant(), 5, new Vector2(randX, randY));
			plants.add(p);
			world[p.pos.x][p.pos.y] = p;
		}
	}
	
	static void worldTick() {
		for (int y=0;y<ROWS;y++) {
			for (int x=0;x<COLS;x++) {
				world[x][y] = null;
			}
		}
		for (Iterator<Animal> iterator = animals.iterator(); iterator.hasNext();) {
		    Animal a = iterator.next();
		    if (a.isDead()) { //Check if animal is dead and delete if it is
				iterator.remove();
				continue;
		    }
		    
		     //Reset animals world position to blank to prepare for it's move
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
					System.out.print("x ");
					continue;
				}
					System.out.print(world[x][y].getDisplay() + " ");
			}
			System.out.println("");
		}
		if (!alerts.isEmpty()) {
			for (Iterator<String> iterator = alerts.iterator(); iterator.hasNext();) {
			    String message = iterator.next();
			    System.out.println(message);
			    iterator.remove();
			}
		}
	}
}
