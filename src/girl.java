import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class girl extends GameObject{
	
public girl(int x, int y, int height, int width) {
	super(x,y,height,width);
	
}
public void update() {
	super.update();
	}

public void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.drawImage(GamePanel.girlImg,(int)x,(int)y, width, height, null);

}
public void setPos(Point p) {
	if(p != null) {
	this.x = p.getX();
	

	this.y = p.getY();
	
}
}
}
