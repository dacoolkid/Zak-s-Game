import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Hand handy;
	Pen penny;
	long enemyTimer = 0;
	int enemySpawnTime;
	public void manageEnemies(){
	        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	                addPen(new Pen(new Random().nextInt(Distraction.WIDTH), 0, 50, 50));
	
	enemyTimer = System.currentTimeMillis();
	        }
		}
	ArrayList<Pen> pens = new ArrayList<Pen>();
	public ObjectManager(Hand h, Pen p) {
		handy = h;
		penny = p;
	}
	public void update() {
		handy.update();
		penny.update();
		manageEnemies();

	}
	public void draw(Graphics g) {
	handy.draw(g);
	penny.draw(g);
	for(int i = 0; i < pens.size(); i++) {
		pens.get(i).draw(g);
	}
	}

		
	public void addPen(Pen pencil) {
		pens.add(pencil);
		
	}
	public void purgeObjects() {
		for(int i = 0; i < pens.size(); i++) {
			if(pens.get(i).isAlive = false) {
				pens.remove(i);
			}
			}
		}
}

