import java.awt.Graphics;

public class GameObject {
	double x;
	double y;
	int width;
	int height;
	boolean isAlive = true;

	public GameObject(double xd, double yd, int widthd, int heightd) {
		x = xd;
		y = yd;
		width = widthd;
		height = heightd;

	}

	public void update() {
		this.x++;
		this.y++;
	}

	public void draw(Graphics g) {
		g.fillRect((int)Math.floor(x), (int)Math.floor(y), 100, 100);
	}
}
