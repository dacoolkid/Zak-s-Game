import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Hand handy;
	Pen penny;
	girl girly;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	int score = 0;
	public void manageEnemies(){
	        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	                addPen(new Pen(25,new Random().nextInt(Distraction.HEIGHT), 50, 50));
	
	enemyTimer = System.currentTimeMillis();
	        }
		}
	ArrayList<Pen> pens = new ArrayList<Pen>();
	public ObjectManager(Hand h, Pen p, girl g) {
		handy = h;
		penny = p;
		girly = g;
	}
	public void update() {
		handy.update();
		penny.update();
		girly.update();
		for(int i = 0; i < pens.size();i++) {
			pens.get(i).update();
		}
		manageEnemies();

	}
	public void draw(Graphics g) {
	handy.draw(g);
	penny.draw(g);
	girly.draw(g);
	for(int i = 0; i < pens.size(); i++) {
		pens.get(i).draw(g);
	}
	}

		
	public void addPen(Pen pencil) {
		pens.add(pencil);
		
	}
	public void checkCollision() {
	
		for(Pen p : pens){
			
	        if(handy.collisionBox.intersects(p.collisionBox)){
	        	System.out.println("poopie");
	        		p.isAlive = false;

	        }

	}
	}
	public void purgeObjects() {
		for(int i = 0; i < pens.size(); i++) {
			if(pens.get(i).isAlive == false) {
				pens.remove(i);
			
			}
			}
		}
	public int getScore() {
		return score;
	}
	}


