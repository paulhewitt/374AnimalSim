package saskatchewan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Util.Vector2;

public class saskatchewan {
	
	static final int ROWS = 20;
	static final int COLS = 20;
	
	static final Entity[][] world = new Entity[ROWS][COLS];
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
			System.out.println("Type 'add' to add a new random animal,\n'addp' for a random plant, or type 'exit' to exit: ");
			in = sc.next();
			if (in.equals("add")) {
				int x, y;
				do {
					x = r.nextInt(ROWS);
					y = r.nextInt(COLS);
				} while (world[x][y] != null);
				animals.add(af.CreateAnimal(Animals.getRandomAnimal(), 100, 20, 10, 5, new Vector2(x,y)));
				//plants.add(pf.CreatePlant(Plants.getRandomPlant(), 5, 1, new Vector2(x,y)));
				worldTick();
			}
			
			if (in.equals("addp")) {
				int x, y;
				do {
					x = r.nextInt(ROWS);
					y = r.nextInt(COLS);
				} while (world[x][y] != null);
				//animals.add(af.CreateAnimal(Animals.getRandomAnimal(), 100, 20, 10, 5, new Vector2(x,y)));
				plants.add(pf.CreatePlant(Plants.getRandomPlant(), 5, 1, new Vector2(x,y)));
				worldTick();
			}
		} while (!in.equals("exit"));
		
	}
	
	static void generateWorld() {
		for (int i=0;i<10;i++) {
			animals.add(af.CreateAnimal(Animals.getRandomAnimal(), 100, 20, 10, 5, new Vector2(i, i)));
		}
		for (int i=10;i<15;i++) {
			plants.add(pf.CreatePlant(Plants.getRandomPlant(), 5, 1, new Vector2(i,i)));
		}
	}
	
	static void worldTick() {
		for (Animal a : animals) {
			world[a.pos.x][a.pos.y] = a;
		for (Vegetation p: plants){
			world[p.pos.x][p.pos.y] = p;
		}
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
