import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Phone extends GameObject{
	public Phone(double px, double py, int pheight, int pwidth) {
		super(px, py, pheight, pwidth);
	}
	public void update() {
		super.update();
		x++;

	}
	public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.drawImage(GamePanel.phoneImg,(int)x,(int)y, width, height, null);

	}
	public void setPos(Point p) {
		if(p != null) {
		this.x = p.getX();
		
	
		this.y = p.getY();
		
	}
	}
}