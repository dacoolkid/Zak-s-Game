import java.awt.Graphics;

public class ObjectManager {
	Hand handy;
	public ObjectManager(Hand h) {
		handy = h;
	}
	public void update() {
		handy.update();
	}
	public void draw(Graphics g) {
		
	}
	
}
