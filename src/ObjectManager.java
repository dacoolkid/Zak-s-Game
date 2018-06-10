import java.awt.Graphics;

public class ObjectManager {
	Hand handy;
	Pen penny;
	public ObjectManager(Hand h, Pen p) {
		handy = h;
		penny = p;
	}
	public void update() {
		handy.update();
		penny.update();
	}
	public void draw(Graphics g) {
	handy.draw(g);
	penny.draw(g);
	
	}
	
}
