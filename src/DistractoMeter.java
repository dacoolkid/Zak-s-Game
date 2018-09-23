import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class DistractoMeter extends GameObject{
boolean topped = false;
	public DistractoMeter(int dx, int dy, int dheight, int dwidth) {
		super(dx, dy, dheight, dwidth);
		
		}
	public void update() {
		super.update();
		

	
	}
	public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	//make rect
    g.fillRect((int)x, (int)y, height, width);

	}
	public void setPos(Point p) {
		if(p != null) {
		this.x = p.getX();
		
	
		this.y = p.getY();
		
	}
		
	}
	public void GrowBar() {
		
		//if(topped == false) {
			System.out.println("true");
			
		height = height + 10;
		//if(height >= 80) {
		//	topped = true;
		}
		//else {
		//	topped = false;
		//}
		//}
	//}
	
}


