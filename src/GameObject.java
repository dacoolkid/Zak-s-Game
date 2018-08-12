import java.awt.Graphics;
import java.awt.Rectangle;


public class GameObject {
	double x;
	double y;
	int width;
	int height;
	Rectangle collisionBox;
	boolean isAlive = true;

	public GameObject(double xd, double yd, int widthd, int heightd) {
		x = xd;
		y = yd;
		width = widthd;
		height = heightd;
		collisionBox = new Rectangle((int)x,(int)y,width,height);

	}

	public void update() {
		this.x++;
		this.y++;
	    collisionBox.setBounds((int)x, (int)y, width, height);
	}

	public void draw(Graphics g) {
		g.fillRect((int)Math.floor(x), (int)Math.floor(y), 100, 100);
	}
}
