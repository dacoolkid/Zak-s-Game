import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Hand extends GameObject{
	public Hand(double px, double py, int pheight, int pwidth) {
		super(px, py, pheight, pwidth);
	}
	public void update() {
		super.update();
	}
	public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	
	
	
		 g.drawImage(GamePanel.handImg,(int) x,(int) y, width, height, null);

	}
	public void setPos(Point p) {
		if(p != null) {
		this.x = p.getX();
		
	
		this.y = p.getY();
		
	}
	}
}
