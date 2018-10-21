import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class HealthBar extends GameObject{
	boolean noSwitch = false;
	public HealthBar(int hx, int hy, int hheight, int hwidth) {
		super(hx, hy, hheight, hwidth);
	
		}
	public void update() {
		super.update();
		

	
	}
	public void draw(Graphics g) {
	g.setColor(Color.RED);
	//make rect
    g.fillRect((int)x, (int)y, height, width);

	}
	public void setPos(Point p) {
		if(p != null) {
		this.x = p.getX();
		
	
		this.y = p.getY();
		
	}
		
	}
	public void ShrinkBar() {
		height = height - 10;
		if(height <= 0 ) {
			GamePanel.currentState++;
		}
	}
	public void GrowBar() {
		height = 100;
		noSwitch = true;
		if(height <= 0) {
			noSwitch = false;
		}
		}
		
	}


