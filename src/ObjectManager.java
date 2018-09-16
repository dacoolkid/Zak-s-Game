import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Hand handy;
	Pen penny;
	girl girly;
	Phone phony;
	long enemyTimer = 0;
	long phoneTimer = 0;
	int phoneSpawnTime = 1000;
	int enemySpawnTime = 1000;
	int score = 0;
	public void manageEnemies(){
	        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	                addPen(new Pen(25,new Random().nextInt(Distraction.HEIGHT), 50, 50));
	                
	
	enemyTimer = System.currentTimeMillis();
	        }
	        if(System.currentTimeMillis() - phoneTimer >= phoneSpawnTime) {
	        	addPhone(new Phone(25,new Random().nextInt(Distraction.HEIGHT),50,50));
	        	
	        	phoneTimer = System.currentTimeMillis();
	        }
		}
	ArrayList<Pen> pens = new ArrayList<Pen>();
	ArrayList<Phone> phonez = new ArrayList<Phone>();
	public ObjectManager(Hand h, Pen p, girl g, Phone ph) {
		handy = h;
		penny = p;
		girly = g;
		phony = ph;
	}
	public void update() {
		handy.update();
		penny.update();
		girly.update();

		phony.update();
		for(int i = 0; i < pens.size();i++) {
			pens.get(i).update();
		}
		for(int i = 0; i < phonez.size();i++) {
			phonez.get(i).update();
		}
		manageEnemies();

	}
	public void draw(Graphics g) {
	handy.draw(g);
	penny.draw(g);
	girly.draw(g);
	phony.draw(g);
	for(int i = 0; i < pens.size(); i++) {
		pens.get(i).draw(g);
	}
	for(int i = 0; i < phonez.size(); i++) {
		phonez.get(i).draw(g);
	}
	}

		
	public void addPen(Pen pencil) {
		pens.add(pencil);
		
	}
	public void addPhone(Phone phone) {
		phonez.add(phone);
	}

	
	public void checkCollision() {
	
		for(Pen p : pens){
			
	        if(handy.collisionBox.intersects(p.collisionBox)){
	        	System.out.println("poopie");
	        		p.isAlive = false;

	        }
	    	for(Phone ph : phonez){
				
		        if(handy.collisionBox.intersects(ph.collisionBox)){
		        	System.out.println("oopie");
		        		ph.isAlive = false;

		        }
	}
		for(Pen ps : pens){
			if(girly.collisionBox.intersects(ps.collisionBox)){
	        	System.out.println("dookie");
	        		ps.isAlive = false;

	        }

		}
		}
	}
	public void purgeObjects() {
				for(int i = 0; i < pens.size(); i++) {
			if(pens.get(i).isAlive == false) {
				pens.remove(i);
			
			}
			}
		for(int i = 0; i <  phonez.size(); i++) {
			if(phonez.get(i).isAlive == false) {
				phonez.remove(i);
			
			}
			}
		}
	public int getScore() {
		return score;
	}
	}


