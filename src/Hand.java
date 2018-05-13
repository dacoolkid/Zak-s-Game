import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Hand extends GameObject{
	public Hand(double px, double py, int pheight, int pwidth) {
		super(px, py, pheight, pwidth);
	}
	public void update() {
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);

        g.fillRect((int)Math.floor(x), (int)Math.floor(y), width, height);


	}
	public void setPos(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
}
