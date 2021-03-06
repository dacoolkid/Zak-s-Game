import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Pen extends GameObject{
	
	double xDiff = 315 - x;
	double yDiff = 300 - y;
	double xMoveDis = xDiff/20;
	double yMoveDis = yDiff/20;
	public Pen(double px, double py, int pheight, int pwidth) {
		super(px, py, pheight, pwidth);
		
		}
	public void update() {
		super.update();
		x += xMoveDis;
		y += yMoveDis;

	
	}
	public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.drawImage(GamePanel.pencilImg,(int)x,(int)y, width, height, null);
	
	

	}
	public void setPos(Point p) {
		if(p != null) {
		this.x = p.getX();
		
	
		this.y = p.getY();
		
	}
	}
}